package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p009b.p033c0.C0464e;
import p009b.p033c0.C0467g;

public final class OverwritingInputMerger extends C0467g {
    /* renamed from: a */
    public C0464e mo1326a(List<C0464e> list) {
        C0464e.C0465a aVar = new C0464e.C0465a();
        HashMap hashMap = new HashMap();
        for (C0464e eVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(eVar.f2080a));
        }
        aVar.mo2727b(hashMap);
        return aVar.mo2726a();
    }
}
