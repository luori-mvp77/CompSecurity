// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.View;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;
import com.soundcloud.android.tracks.DownloadableTrackItemRenderer;
import com.soundcloud.android.tracks.TrackItem;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            NowPlayingAdapter

public class PagedTracksRecyclerItemAdapter extends PagingRecyclerItemAdapter
    implements NowPlayingAdapter
{
    public static class TrackViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public TrackViewHolder(View view)
        {
            super(view);
        }
    }


    static final int TRACK_ITEM_TYPE = 0;

    public PagedTracksRecyclerItemAdapter(DownloadableTrackItemRenderer downloadabletrackitemrenderer)
    {
        super(downloadabletrackitemrenderer);
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected TrackViewHolder createViewHolder(View view)
    {
        return new TrackViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        return 0;
    }

    public void updateNowPlaying(Urn urn)
    {
        TrackItem trackitem;
        for (Iterator iterator = getItems().iterator(); iterator.hasNext(); trackitem.setIsPlaying(trackitem.getEntityUrn().equals(urn)))
        {
            trackitem = (TrackItem)iterator.next();
        }

        notifyDataSetChanged();
    }
}
