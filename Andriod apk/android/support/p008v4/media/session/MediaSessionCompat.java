package android.support.p008v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p008v4.media.MediaDescriptionCompat;
import p000a.p001a.p003b.p005b.p006a.C0008a;
import p133c.p149b.p152b.p153a.C2108a;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0020a();

        /* renamed from: c */
        public final MediaDescriptionCompat f23c;

        /* renamed from: d */
        public final long f24d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public static class C0020a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f23c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f24d = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder o = C2108a.m5005o("MediaSession.QueueItem {Description=");
            o.append(this.f23c);
            o.append(", Id=");
            o.append(this.f24d);
            o.append(" }");
            return o.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f23c.writeToParcel(parcel, i);
            parcel.writeLong(this.f24d);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0021a();

        /* renamed from: c */
        public ResultReceiver f25c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public static class C0021a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f25c = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f25c.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0022a();

        /* renamed from: c */
        public final Object f26c;

        /* renamed from: d */
        public C0008a f27d = null;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public static class C0022a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this.f26c = obj;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f26c;
            Object obj3 = ((Token) obj).f26c;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f26c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f26c, i);
        }
    }

    /* renamed from: a */
    public static void m13a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
