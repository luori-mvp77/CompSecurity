// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            RemoveLocalPlaylistsCommand

public final class  extends b
    implements a, Provider
{

    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/playlists/RemoveLocalPlaylistsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/sync/playlists/RemoveLocalPlaylistsCommand, getClass().getClassLoader(), false);
    }

    public final RemoveLocalPlaylistsCommand get()
    {
        RemoveLocalPlaylistsCommand removelocalplaylistscommand = new RemoveLocalPlaylistsCommand((PropellerDatabase)propeller.get());
        injectMembers(removelocalplaylistscommand);
        return removelocalplaylistscommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set1.add(supertype);
    }

    public final void injectMembers(RemoveLocalPlaylistsCommand removelocalplaylistscommand)
    {
        supertype.injectMembers(removelocalplaylistscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemoveLocalPlaylistsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.playlists.RemoveLocalPlaylistsCommand", "members/com.soundcloud.android.sync.playlists.RemoveLocalPlaylistsCommand", false, com/soundcloud/android/sync/playlists/RemoveLocalPlaylistsCommand);
    }
}
