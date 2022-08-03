package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import p133c.p149b.p152b.p153a.C2108a;

@TargetApi(21)
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f665a;

    /* renamed from: b */
    public int f666b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f665a.equals(((AudioAttributesImplApi21) obj).f665a);
    }

    public int hashCode() {
        return this.f665a.hashCode();
    }

    public String toString() {
        StringBuilder o = C2108a.m5005o("AudioAttributesCompat: audioattributes=");
        o.append(this.f665a);
        return o.toString();
    }
}
