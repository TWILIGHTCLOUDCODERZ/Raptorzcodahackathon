package androidx.work.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;
import p009b.p033c0.p034r.p042o.C0545b;
import p009b.p033c0.p034r.p042o.C0546c;
import p009b.p033c0.p034r.p042o.C0549e;
import p009b.p033c0.p034r.p042o.C0550f;
import p009b.p033c0.p034r.p042o.C0554h;
import p009b.p033c0.p034r.p042o.C0555i;
import p009b.p033c0.p034r.p042o.C0559k;
import p009b.p033c0.p034r.p042o.C0560l;
import p009b.p033c0.p034r.p042o.C0570n;
import p009b.p033c0.p034r.p042o.C0571o;
import p009b.p123v.C1766a;
import p009b.p123v.C1772e;
import p009b.p123v.C1782g;
import p009b.p127x.p128a.C1799b;
import p009b.p127x.p128a.C1800c;
import p009b.p127x.p128a.p129f.C1805a;
import p009b.p127x.p128a.p129f.C1807b;
import p009b.p127x.p128a.p129f.C1810c;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q */
    public static final /* synthetic */ int f991q = 0;

    /* renamed from: l */
    public volatile C0559k f992l;

    /* renamed from: m */
    public volatile C0545b f993m;

    /* renamed from: n */
    public volatile C0570n f994n;

    /* renamed from: o */
    public volatile C0549e f995o;

    /* renamed from: p */
    public volatile C0554h f996p;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C0176a extends C1782g.C1783a {
        public C0176a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo1363a(C1799b bVar) {
            ((C1805a) bVar).f5481c.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C1805a aVar = (C1805a) bVar;
            aVar.f5481c.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.f5481c.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.f5481c.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.f5481c.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.f5481c.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f5481c.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.f5481c.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f5481c.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f5481c.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.f5481c.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f5481c.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
        }
    }

    /* renamed from: e */
    public C1772e mo1361e() {
        return new C1772e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* renamed from: f */
    public C1800c mo1362f(C1766a aVar) {
        C1782g gVar = new C1782g(aVar, new C0176a(6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        Context context = aVar.f5375b;
        String str = aVar.f5376c;
        if (context != null) {
            Objects.requireNonNull((C1810c) aVar.f5374a);
            return new C1807b(context, str, gVar);
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: k */
    public C0545b mo1356k() {
        C0545b bVar;
        if (this.f993m != null) {
            return this.f993m;
        }
        synchronized (this) {
            if (this.f993m == null) {
                this.f993m = new C0546c(this);
            }
            bVar = this.f993m;
        }
        return bVar;
    }

    /* renamed from: l */
    public C0549e mo1357l() {
        C0549e eVar;
        if (this.f995o != null) {
            return this.f995o;
        }
        synchronized (this) {
            if (this.f995o == null) {
                this.f995o = new C0550f(this);
            }
            eVar = this.f995o;
        }
        return eVar;
    }

    /* renamed from: m */
    public C0554h mo1358m() {
        C0554h hVar;
        if (this.f996p != null) {
            return this.f996p;
        }
        synchronized (this) {
            if (this.f996p == null) {
                this.f996p = new C0555i(this);
            }
            hVar = this.f996p;
        }
        return hVar;
    }

    /* renamed from: n */
    public C0559k mo1359n() {
        C0559k kVar;
        if (this.f992l != null) {
            return this.f992l;
        }
        synchronized (this) {
            if (this.f992l == null) {
                this.f992l = new C0560l(this);
            }
            kVar = this.f992l;
        }
        return kVar;
    }

    /* renamed from: o */
    public C0570n mo1360o() {
        C0570n nVar;
        if (this.f994n != null) {
            return this.f994n;
        }
        synchronized (this) {
            if (this.f994n == null) {
                this.f994n = new C0571o(this);
            }
            nVar = this.f994n;
        }
        return nVar;
    }
}
