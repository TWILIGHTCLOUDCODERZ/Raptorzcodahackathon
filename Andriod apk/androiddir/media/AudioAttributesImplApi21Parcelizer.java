package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import p009b.p027b0.C0439a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C0439a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f665a = (AudioAttributes) aVar.mo2674m(audioAttributesImplApi21.f665a, 1);
        audioAttributesImplApi21.f666b = aVar.mo2672k(audioAttributesImplApi21.f666b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C0439a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributes audioAttributes = audioAttributesImplApi21.f665a;
        aVar.mo2677p(1);
        aVar.mo2682u(audioAttributes);
        int i = audioAttributesImplApi21.f666b;
        aVar.mo2677p(2);
        aVar.mo2681t(i);
    }
}
