package androidx.media;

import java.util.Objects;
import p009b.p027b0.C0439a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0439a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f664a;
        if (aVar.mo2670i(1)) {
            obj = aVar.mo2676o();
        }
        audioAttributesCompat.f664a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0439a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f664a;
        aVar.mo2677p(1);
        aVar.mo2684w(audioAttributesImpl);
    }
}
