// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.VideoList;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onSimilarVideosFetched(final VideoList videoList, final int statusCode)
    {
        dateCacheIfNecessary(videoList, statusCode);
        BrowseAgent.access$5300(_fld0).post(new Runnable() {

            final BrowseAgent.FetchSimilarVideosForQuerySuggestionTask._cls1 this$2;
            final int val$statusCode;
            final VideoList val$videoList;

            public void run()
            {
                getCallback().onSimilarVideosFetched(videoList, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchSimilarVideosForQuerySuggestionTask._cls1.this;
                videoList = videolist;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
