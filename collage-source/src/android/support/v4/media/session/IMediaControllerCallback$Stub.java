// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            IMediaControllerCallback, PlaybackStateCompat, ParcelableVolumeInfo

public static abstract class attachInterface extends Binder
    implements IMediaControllerCallback
{
    private static class Proxy
        implements IMediaControllerCallback
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "android.support.v4.media.session.IMediaControllerCallback";
        }

        public void onEvent(String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcel.writeString(s);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public void onExtrasChanged(Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (mediametadatacompat == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            mediametadatacompat.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            mediametadatacompat;
            parcel.recycle();
            throw mediametadatacompat;
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackstatecompat == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            playbackstatecompat.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            playbackstatecompat;
            parcel.recycle();
            throw playbackstatecompat;
        }

        public void onQueueChanged(List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            par