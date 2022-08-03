package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p009b.p033c0.C0464e;
import p009b.p033c0.C0485q;
import p009b.p033c0.p034r.p043p.p045m.C0598a;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f978a;

    /* renamed from: b */
    public C0464e f979b;

    /* renamed from: c */
    public Set<String> f980c;

    /* renamed from: d */
    public C0175a f981d;

    /* renamed from: e */
    public int f982e;

    /* renamed from: f */
    public Executor f983f;

    /* renamed from: g */
    public C0598a f984g;

    /* renamed from: h */
    public C0485q f985h;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C0175a {

        /* renamed from: a */
        public List<String> f986a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f987b = Collections.emptyList();

        /* renamed from: c */
        public Network f988c;
    }

    public WorkerParameters(UUID uuid, C0464e eVar, Collection<String> collection, C0175a aVar, int i, Executor executor, C0598a aVar2, C0485q qVar) {
        this.f978a = uuid;
        this.f979b = eVar;
        this.f980c = new HashSet(collection);
        this.f981d = aVar;
        this.f982e = i;
        this.f983f = executor;
        this.f984g = aVar2;
        this.f985h = qVar;
    }
}
