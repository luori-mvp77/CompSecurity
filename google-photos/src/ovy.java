// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.video.trim.VideoTrimView;

public final class ovy
    implements Runnable
{

    private VideoTrimView a;

    public ovy(VideoTrimView videotrimview)
    {
        a = videotrimview;
        super();
    }

    public final void run()
    {
        VideoTrimView.a(a);
    }
}
