// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoDecorateAlbumItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class emt extends epa
{

    private final gxt c = new gxt(new Class[0]);

    public emt(Context context, Resolver resolver, epc epc)
    {
        super(context, resolver, epc);
    }

    protected final String a()
    {
        UriBuilder uribuilder = new UriBuilder("sp://core-collection/unstable/@/decorate");
        uribuilder.q = com.spotify.mobile.android.spotlets.collection.util.UriBuilder.Format.b;
        uribuilder.k = super.b;
        return uribuilder.a();
    }

    protected final Map a(byte abyte0[])
    {
        Object obj = (ProtoDecorateResponse)c.a(abyte0, com/spotify/mobile/android/spotlets/collection/proto/ProtoDecorateResponse);
        if (obj == null)
        {
            return null;
        }
        abyte0 = new HashMap();
        ProtoDecorateAlbumItem protodecoratealbumitem;
        for (obj = ((ProtoDecorateResponse) (obj)).album.iterator(); ((Iterator) (obj)).hasNext(); abyte0.put(protodecoratealbumitem.album_metadata.link, enz.a(protodecoratealbumitem.album_metadata, protodecoratealbumitem.offline_state, protodecoratealbumitem.collection_state, null)))
        {
            protodecoratealbumitem = (ProtoDecorateAlbumItem)((Iterator) (obj)).next();
        }

        return abyte0;
    }
}
