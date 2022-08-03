package androidx.work;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p009b.p033c0.C0464e;
import p009b.p033c0.C0467g;

public final class ArrayCreatingInputMerger extends C0467g {
    /* renamed from: a */
    public C0464e mo1326a(List<C0464e> list) {
        Object newInstance;
        C0464e.C0465a aVar = new C0464e.C0465a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C0464e eVar : list) {
            Iterator<Map.Entry<String, Object>> it = Collections.unmodifiableMap(eVar.f2080a).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                int length = Array.getLength(obj);
                                int length2 = Array.getLength(value);
                                Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                                System.arraycopy(obj, 0, newInstance2, 0, length);
                                System.arraycopy(value, 0, newInstance2, length, length2);
                                value = newInstance2;
                            } else {
                                newInstance = Array.newInstance(obj.getClass(), 2);
                                Array.set(newInstance, 0, obj);
                                Array.set(newInstance, 1, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = mo1327b(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = mo1327b(value, obj);
                        }
                        hashMap.put(str, value);
                    } else if (cls.isArray()) {
                        hashMap.put(str, value);
                    } else {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                    }
                    value = newInstance;
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo2727b(hashMap);
        return aVar.mo2726a();
    }

    /* renamed from: b */
    public final Object mo1327b(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}
