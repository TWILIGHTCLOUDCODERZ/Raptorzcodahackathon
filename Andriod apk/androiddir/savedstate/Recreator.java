package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p009b.p114q.C1661d;
import p009b.p114q.C1664e;
import p009b.p114q.C1666g;
import p009b.p114q.C1667h;
import p009b.p126w.C1793a;
import p009b.p126w.C1797c;
import p133c.p149b.p152b.p153a.C2108a;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements C1664e {

    /* renamed from: c */
    public final C1797c f966c;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C0168a implements C1793a.C1795b {

        /* renamed from: a */
        public final Set<String> f967a = new HashSet();

        public C0168a(C1793a aVar) {
            aVar.mo5007b("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo91a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f967a));
            return bundle;
        }
    }

    public Recreator(C1797c cVar) {
        this.f966c = cVar;
    }

    /* renamed from: j */
    public void mo89j(C1666g gVar, C1661d.C1662a aVar) {
        if (aVar == C1661d.C1662a.ON_CREATE) {
            C1667h hVar = (C1667h) gVar.mo67b();
            hVar.mo4771c("removeObserver");
            hVar.f5112a.mo2693p(this);
            Bundle a = this.f966c.mo69d().mo5006a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C1793a.C1794a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((C1793a.C1794a) declaredConstructor.newInstance(new Object[0])).mo852a(this.f966c);
                                } catch (Exception e) {
                                    throw new RuntimeException(C2108a.m4997g("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder o = C2108a.m5005o("Class");
                                o.append(asSubclass.getSimpleName());
                                o.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(o.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(C2108a.m4998h("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
