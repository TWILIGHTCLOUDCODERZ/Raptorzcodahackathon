package android.support.p008v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0015a();

    /* renamed from: c */
    public final int f8c;

    /* renamed from: d */
    public final MediaDescriptionCompat f9d;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    public static class C0015a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public Object[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f8c = parcel.readInt();
        this.f9d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f8c + ", mDescription=" + this.f9d + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8c);
        this.f9d.writeToParcel(parcel, i);
    }
}
