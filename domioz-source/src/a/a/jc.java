// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            ic

public final class jc
    implements ic
{

    private static final String a;
    private final ic b;

    public jc(ic ic1)
    {
        b = ic1;
    }

    private static String a(Map map)
    {
        Object obj = new ArrayList();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (!((String)entry.getKey()).equals("X-Appboy-Api-Key"))
            {
                ((List) (obj)).add(String.format("(%s / %s)", new Object[] {
                    entry.getKey(), entry.getValue()
                }));
            }
        } while (true);
        map = new StringBuilder();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); map.append(", "))
        {
            map.append((String)((Iterator) (obj)).next());
        }

        if (map.length() == 0)
        {
            return "";
        } else
        {
            return map.substring(0, map.length() - 2);
        }
    }

    private static void a(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        jsonobject = "none";
_L1:
        try
        {
            String.format("Result [%s]", new Object[] {
                jsonobject
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_35;
        jsonobject = jsonobject.toString();
          goto _L1
    }

    public final JSONObject a(URI uri, Map map)
    {
        try
        {
            String.format("Making request to [%s], with headers: [%s]", new Object[] {
                uri.toString(), a(map)
            });
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        uri = b.a(uri, map);
        a(((JSONObject) (uri)));
        return uri;
    }

    public final JSONObject a(URI uri, Map map, JSONObject jsonobject)
    {
        try
        {
            String.format("Making request to [%s], with headers: [%s] and JSON parameters: [%s]", new Object[] {
                uri.toString(), a(map), jsonobject.toString()
            });
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        uri = b.a(uri, map, jsonobject);
        a(((JSONObject) (uri)));
        return uri;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/jc.getName()
        });
    }
}
