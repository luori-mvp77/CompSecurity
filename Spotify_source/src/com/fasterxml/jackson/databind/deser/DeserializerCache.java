// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            ResolvableDeserializer, DeserializerFactory

public final class DeserializerCache
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected final ConcurrentHashMap _cachedDeserializers = new ConcurrentHashMap(64, 0.75F, 2);
    protected final HashMap _incompleteDeserializers = new HashMap(8);

    public DeserializerCache()
    {
    }

    private Class _verifyAsClass(Object obj, String s, Class class1)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Class) (obj));
_L2:
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder("AnnotationIntrospector.")).append(s).append("() returned value of type ").append(obj.getClass().getName()).append(": expected type JsonSerializer or Class<JsonSerializer> instead").toString());
        }
        s = (Class)obj;
        if (s == class1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s;
        if (!ClassUtil.isBogusClass(s)) goto _L4; else goto _L3
_L3:
        return null;
    }

    private JavaType modifyTypeByAnnotation(DeserializationContext deserializationcontext, Annotated annotated, JavaType javatype)
    {
        Object obj;
        Object obj1;
        obj = deserializationcontext.getAnnotationIntrospector();
        obj1 = ((AnnotationIntrospector) (obj)).findDeserializationType(annotated, javatype);
        if (obj1 != null)
        {
            JavaType javatype1;
            try
            {
                javatype1 = javatype.narrowBy(((Class) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw new JsonMappingException((new StringBuilder("Failed to narrow type ")).append(javatype).append(" with concrete-type annotation (value ").append(((Class) (obj1)).getName()).append("), method '").append(annotated.getName()).append("': ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
            }
            javatype = javatype1;
        }
        if (!javatype.isContainerType()) goto _L2; else goto _L1
_L1:
        obj1 = ((AnnotationIntrospector) (obj)).findDeserializationKeyType(annotated, javatype.getKeyType());
        JavaType javatype2;
        if (obj1 != null)
        {
            if (!(javatype instanceof MapLikeType))
            {
                throw new JsonMappingException((new StringBuilder("Illegal key-type annotation: type ")).append(javatype).append(" is not a Map(-like) type").toString());
            }
            try
            {
                javatype2 = ((MapLikeType)javatype).narrowKey(((Class) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw new JsonMappingException((new StringBuilder("Failed to narrow key type ")).append(javatype).append(" with key-type annotation (").append(((Class) (obj1)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
            }
        } else
        {
            javatype2 = javatype;
        }
        obj1 = javatype2.getKeyType();
        javatype = javatype2;
        if (obj1 != null)
        {
            javatype = javatype2;
            if (((JavaType) (obj1)).getValueHandler() == null)
            {
                obj1 = ((AnnotationIntrospector) (obj)).findKeyDeserializer(annotated);
                javatype = javatype2;
                if (obj1 != null)
                {
                    obj1 = deserializationcontext.keyDeserializerInstance(annotated, obj1);
                    javatype = javatype2;
                    if (obj1 != null)
                    {
                        javatype = ((MapLikeType)javatype2).withKeyValueHandler(obj1);
                        javatype.getKeyType();
                    }
                }
            }
        }
        obj1 = ((AnnotationIntrospector) (obj)).findDeserializationContentType(annotated, javatype.getContentType());
        javatype2 = javatype;
        if (obj1 != null)
        {
            try
            {
                javatype2 = javatype.narrowContentsBy(((Class) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw new JsonMappingException((new StringBuilder("Failed to narrow content type ")).append(javatype).append(" with content-type annotation (").append(((Class) (obj1)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
            }
        }
        javatype = javatype2;
        if (javatype2.getContentType().getValueHandler() != null) goto _L4; else goto _L3
_L3:
        obj = ((AnnotationIntrospector) (obj)).findContentDeserializer(annotated);
        javatype = javatype2;
        if (obj == null) goto _L4; else goto _L5
_L5:
        if (obj instanceof JsonDeserializer) goto _L7; else goto _L6
_L6:
        javatype = _verifyAsClass(obj, "findContentDeserializer", com/fasterxml/jackson/databind/JsonDeserializer$None);
        if (javatype == null) goto _L7; else goto _L8
_L8:
        deserializationcontext = deserializationcontext.deserializerInstance(annotated, javatype);
_L9:
        javatype = javatype2;
        if (deserializationcontext != null)
        {
            javatype = javatype2.withContentValueHandler(deserializationcontext);
        }
_L4:
        return javatype;
_L7:
        deserializationcontext = null;
        if (true) goto _L9; else goto _L2
_L2:
        return javatype;
    }

    protected final JsonDeserializer _createAndCache2(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        try
        {
            deserializerfactory = _createDeserializer(deserializationcontext, deserializerfactory, javatype);
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw new JsonMappingException(deserializationcontext.getMessage(), null, deserializationcontext);
        }
        if (deserializerfactory == null)
        {
            deserializationcontext = null;
        } else
        {
            boolean flag = deserializerfactory instanceof ResolvableDeserializer;
            boolean flag1 = deserializerfactory.isCachable();
            if (flag)
            {
                _incompleteDeserializers.put(javatype, deserializerfactory);
                ((ResolvableDeserializer)deserializerfactory).resolve(deserializationcontext);
                _incompleteDeserializers.remove(javatype);
            }
            deserializationcontext = deserializerfactory;
            if (flag1)
            {
                _cachedDeserializers.put(javatype, deserializerfactory);
                return deserializerfactory;
            }
        }
        return deserializationcontext;
    }

    protected final JsonDeserializer _createAndCacheValueDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        HashMap hashmap = _incompleteDeserializers;
        hashmap;
        JVM INSTR monitorenter ;
        JsonDeserializer jsondeserializer = _findCachedDeserializer(javatype);
        if (jsondeserializer == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return jsondeserializer;
        int i = _incompleteDeserializers.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        jsondeserializer = (JsonDeserializer)_incompleteDeserializers.get(javatype);
        if (jsondeserializer == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return jsondeserializer;
        deserializationcontext;
        hashmap;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        deserializationcontext = _createAndCache2(deserializationcontext, deserializerfactory, javatype);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (_incompleteDeserializers.size() > 0)
        {
            _incompleteDeserializers.clear();
        }
        hashmap;
        JVM INSTR monitorexit ;
        return deserializationcontext;
        deserializationcontext;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (_incompleteDeserializers.size() > 0)
        {
            _incompleteDeserializers.clear();
        }
        throw deserializationcontext;
    }

    protected final JsonDeserializer _createDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        Object obj;
        DeserializationConfig deserializationconfig;
label0:
        {
            deserializationconfig = deserializationcontext.getConfig();
            if (!javatype.isAbstract() && !javatype.isMapLikeType())
            {
                obj = javatype;
                if (!javatype.isCollectionLikeType())
                {
                    break label0;
                }
            }
            obj = deserializerfactory.mapAbstractType(deserializationconfig, javatype);
        }
        javatype = deserializationconfig.introspect(((JavaType) (obj)));
        Object obj1 = findDeserializerFromAnnotation(deserializationcontext, javatype.getClassInfo());
        if (obj1 != null)
        {
            return ((JsonDeserializer) (obj1));
        }
        JavaType javatype1 = modifyTypeByAnnotation(deserializationcontext, javatype.getClassInfo(), ((JavaType) (obj)));
        obj1 = obj;
        if (javatype1 != obj)
        {
            javatype = deserializationconfig.introspect(javatype1);
            obj1 = javatype1;
        }
        obj = javatype.findPOJOBuilder();
        if (obj != null)
        {
            return deserializerfactory.createBuilderBasedDeserializer(deserializationcontext, ((JavaType) (obj1)), javatype, ((Class) (obj)));
        }
        obj = javatype.findDeserializationConverter();
        if (obj == null)
        {
            return _createDeserializer2(deserializationcontext, deserializerfactory, ((JavaType) (obj1)), javatype);
        }
        javatype1 = ((Converter) (obj)).getInputType(deserializationcontext.getTypeFactory());
        if (!javatype1.hasRawClass(((JavaType) (obj1)).getRawClass()))
        {
            javatype = deserializationconfig.introspect(javatype1);
        }
        return new StdDelegatingDeserializer(((Converter) (obj)), javatype1, _createDeserializer2(deserializationcontext, deserializerfactory, javatype1, javatype));
    }

    protected final JsonDeserializer _createDeserializer2(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype, BeanDescription beandescription)
    {
        DeserializationConfig deserializationconfig = deserializationcontext.getConfig();
        if (javatype.isEnumType())
        {
            return deserializerfactory.createEnumDeserializer(deserializationcontext, javatype, beandescription);
        }
        if (javatype.isContainerType())
        {
            if (javatype.isArrayType())
            {
                return deserializerfactory.createArrayDeserializer(deserializationcontext, (ArrayType)javatype, beandescription);
            }
            if (javatype.isMapLikeType())
            {
                javatype = (MapLikeType)javatype;
                if (javatype.isTrueMapType())
                {
                    return deserializerfactory.createMapDeserializer(deserializationcontext, (MapType)javatype, beandescription);
                } else
                {
                    return deserializerfactory.createMapLikeDeserializer(deserializationcontext, javatype, beandescription);
                }
            }
            if (javatype.isCollectionLikeType())
            {
                com.fasterxml.jackson.annotation.JsonFormat.Value value = beandescription.findExpectedFormat(null);
                if (value == null || value.getShape() != com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
                {
                    javatype = (CollectionLikeType)javatype;
                    if (javatype.isTrueCollectionType())
                    {
                        return deserializerfactory.createCollectionDeserializer(deserializationcontext, (CollectionType)javatype, beandescription);
                    } else
                    {
                        return deserializerfactory.createCollectionLikeDeserializer(deserializationcontext, javatype, beandescription);
                    }
                }
            }
        }
        if (com/fasterxml/jackson/databind/JsonNode.isAssignableFrom(javatype.getRawClass()))
        {
            return deserializerfactory.createTreeDeserializer(deserializationconfig, javatype, beandescription);
        } else
        {
            return deserializerfactory.createBeanDeserializer(deserializationcontext, javatype, beandescription);
        }
    }

    protected final JsonDeserializer _findCachedDeserializer(JavaType javatype)
    {
        if (javatype == null)
        {
            throw new IllegalArgumentException("Null JavaType passed");
        } else
        {
            return (JsonDeserializer)_cachedDeserializers.get(javatype);
        }
    }

    protected final KeyDeserializer _handleUnknownKeyDeserializer(JavaType javatype)
    {
        throw new JsonMappingException((new StringBuilder("Can not find a (Map) Key deserializer for type ")).append(javatype).toString());
    }

    protected final JsonDeserializer _handleUnknownValueDeserializer(JavaType javatype)
    {
        if (!ClassUtil.isConcrete(javatype.getRawClass()))
        {
            throw new JsonMappingException((new StringBuilder("Can not find a Value deserializer for abstract type ")).append(javatype).toString());
        } else
        {
            throw new JsonMappingException((new StringBuilder("Can not find a Value deserializer for type ")).append(javatype).toString());
        }
    }

    protected final Converter findConverter(DeserializationContext deserializationcontext, Annotated annotated)
    {
        Object obj = deserializationcontext.getAnnotationIntrospector().findDeserializationConverter(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return deserializationcontext.converterInstance(annotated, obj);
        }
    }

    protected final JsonDeserializer findConvertingDeserializer(DeserializationContext deserializationcontext, Annotated annotated, JsonDeserializer jsondeserializer)
    {
        annotated = findConverter(deserializationcontext, annotated);
        if (annotated == null)
        {
            return jsondeserializer;
        } else
        {
            return new StdDelegatingDeserializer(annotated, annotated.getInputType(deserializationcontext.getTypeFactory()), jsondeserializer);
        }
    }

    protected final JsonDeserializer findDeserializerFromAnnotation(DeserializationContext deserializationcontext, Annotated annotated)
    {
        Object obj = deserializationcontext.getAnnotationIntrospector().findDeserializer(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return findConvertingDeserializer(deserializationcontext, annotated, deserializationcontext.deserializerInstance(annotated, obj));
        }
    }

    public final KeyDeserializer findKeyDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        KeyDeserializer keydeserializer = deserializerfactory.createKeyDeserializer(deserializationcontext, javatype);
        if (keydeserializer == null)
        {
            deserializerfactory = _handleUnknownKeyDeserializer(javatype);
        } else
        {
            deserializerfactory = keydeserializer;
            if (keydeserializer instanceof ResolvableDeserializer)
            {
                ((ResolvableDeserializer)keydeserializer).resolve(deserializationcontext);
                return keydeserializer;
            }
        }
        return deserializerfactory;
    }

    public final JsonDeserializer findValueDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        JsonDeserializer jsondeserializer = _findCachedDeserializer(javatype);
        Object obj = jsondeserializer;
        if (jsondeserializer == null)
        {
            deserializationcontext = _createAndCacheValueDeserializer(deserializationcontext, deserializerfactory, javatype);
            obj = deserializationcontext;
            if (deserializationcontext == null)
            {
                obj = _handleUnknownValueDeserializer(javatype);
            }
        }
        return ((JsonDeserializer) (obj));
    }

    final Object writeReplace()
    {
        _incompleteDeserializers.clear();
        return this;
    }
}
