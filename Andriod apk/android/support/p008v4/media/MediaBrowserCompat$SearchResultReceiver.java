package android.support.p008v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p008v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p000a.p001a.p003b.p007c.C0012b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
public class MediaBrowserCompat$SearchResultReceiver extends C0012b {
    /* renamed from: a */
    public void mo12a(int i, Bundle bundle) {
        MediaSessionCompat.m13a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
