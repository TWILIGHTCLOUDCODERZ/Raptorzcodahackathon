package android.support.p008v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p008v4.media.session.MediaSessionCompat;
import p000a.p001a.p003b.p007c.C0012b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
public class MediaBrowserCompat$ItemReceiver extends C0012b {
    /* renamed from: a */
    public void mo12a(int i, Bundle bundle) {
        MediaSessionCompat.m13a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
