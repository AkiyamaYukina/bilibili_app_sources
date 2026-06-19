package com.bilibili.lib.tribe.core.internal.loader;

import Ef0.InterfaceC1643b;
import Gf0.InterfaceC1965A;
import Gf0.InterfaceC1969d;
import Gf0.u;
import Gf0.x;
import If0.C2291a;
import If0.C2294d;
import If0.f;
import Lf0.C2535a;
import M3.C2592k;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.tribe.core.internal.loader.a;
import com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider;
import com.bilibili.lib.tribe.core.internal.stub.TribeStubService;
import com.bilibili.studio.material.util.UtilsKt;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/loader/DefaultClassLoaderService.class */
public final class DefaultClassLoaderService implements com.bilibili.lib.tribe.core.internal.loader.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassLoader f64646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ApplicationInfo f64647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Function0<Boolean> f64648c = new C2592k(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ReentrantReadWriteLock f64649d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TreeMap<String, f> f64650e = new TreeMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HashMap<String, C2291a> f64651f = new HashMap<>(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ClassLoader f64652g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/loader/DefaultClassLoaderService$PathRootClassLoader.class */
    public static final class PathRootClassLoader extends PathClassLoader implements a.InterfaceC0361a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DefaultClassLoaderService f64653a;

        public PathRootClassLoader(@NotNull DefaultClassLoaderService defaultClassLoaderService) {
            super("", defaultClassLoaderService.f64647b.nativeLibraryDir, defaultClassLoaderService.f64646a);
            this.f64653a = defaultClassLoaderService;
        }

        @Keep
        public final void addDexPath(@NotNull String str) {
            try {
                Method declaredMethod = BaseDexClassLoader.class.getDeclaredMethod("addDexPath", (Class[]) Arrays.copyOf(new Class[]{String.class}, 1));
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                declaredMethod.invoke(getParent(), str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Keep
        public final void addDexPath(@NotNull String str, boolean z6) {
            try {
                Method declaredMethod = BaseDexClassLoader.class.getDeclaredMethod("addDexPath", (Class[]) Arrays.copyOf(new Class[]{String.class, Boolean.TYPE}, 2));
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                declaredMethod.invoke(getParent(), str, Boolean.valueOf(z6));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Keep
        public final void addNativePath(@NotNull Collection<String> collection) {
            try {
                Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(BaseDexClassLoader.class, "addNativePath", new Class[]{Collection.class});
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(getParent(), collection);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.bilibili.lib.tribe.core.internal.loader.a.InterfaceC0361a
        public final DefaultClassLoaderService getService() {
            return this.f64653a;
        }

        @Override // java.lang.ClassLoader
        @NotNull
        public final Class<?> loadClass(@NotNull String str) {
            return this.f64653a.i(str);
        }

        @Override // dalvik.system.BaseDexClassLoader
        @NotNull
        public final String toString() {
            return "PathRootClassLoader(dynamics=" + this.f64653a.g() + ", parent=" + getParent() + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/loader/DefaultClassLoaderService$a.class */
    public static final class a extends ClassLoader implements a.InterfaceC0361a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DefaultClassLoaderService f64654a;

        public a(@NotNull DefaultClassLoaderService defaultClassLoaderService) {
            super(defaultClassLoaderService.f64646a);
            this.f64654a = defaultClassLoaderService;
        }

        @Override // com.bilibili.lib.tribe.core.internal.loader.a.InterfaceC0361a
        public final DefaultClassLoaderService getService() {
            return this.f64654a;
        }

        @Override // java.lang.ClassLoader
        @NotNull
        public final Class<?> loadClass(@NotNull String str) {
            return this.f64654a.i(str);
        }

        @NotNull
        public final String toString() {
            return "NormalRootClassLoader(bundles=" + this.f64654a.g() + ", parent=" + getParent() + ")";
        }
    }

    public DefaultClassLoaderService(@NotNull ClassLoader classLoader, @NotNull ApplicationInfo applicationInfo) {
        ClassLoader aVar;
        this.f64646a = classLoader;
        this.f64647b = applicationInfo;
        try {
            aVar = new PathRootClassLoader(this);
        } catch (Throwable th) {
            Log.e("Tribe", "Init PathRootLoader failed, use NormalRootLoader instead.", th);
            aVar = new a(this);
        }
        this.f64652g = aVar;
    }

    public static Class k(C2291a c2291a) throws ClassNotFoundException {
        Class cls;
        InterfaceC1643b interfaceC1643b = c2291a.f10277b;
        String type = interfaceC1643b.getType();
        int iHashCode = type.hashCode();
        if (iHashCode == -987494927) {
            if (type.equals("provider")) {
                TribeStubProvider.Companion.getClass();
                TribeStubProvider.threadLocal.set(c2291a);
                cls = TribeStubProvider.class;
                return cls;
            }
            throw new ClassNotFoundException(android.support.v4.media.a.a("Illegal component type: ", interfaceC1643b.getType(), UtilsKt.DOT));
        }
        if (iHashCode == -808719889) {
            if (type.equals("receiver")) {
                cls = C2535a.class;
                return cls;
            }
            throw new ClassNotFoundException(android.support.v4.media.a.a("Illegal component type: ", interfaceC1643b.getType(), UtilsKt.DOT));
        }
        if (iHashCode == 1984153269 && type.equals(NotificationCompat.CATEGORY_SERVICE)) {
            cls = TribeStubService.class;
            return cls;
        }
        throw new ClassNotFoundException(android.support.v4.media.a.a("Illegal component type: ", interfaceC1643b.getType(), UtilsKt.DOT));
    }

    @Override // com.bilibili.lib.tribe.core.internal.loader.a
    public final void a(@NotNull Function0<Boolean> function0) {
        this.f64648c = function0;
    }

    @Override // com.bilibili.lib.tribe.core.internal.loader.a
    @NotNull
    public final ClassLoader b() {
        return this.f64652g;
    }

    @Override // com.bilibili.lib.tribe.core.internal.loader.a
    @NotNull
    public final C2294d c(@NotNull u uVar) {
        return new C2294d(uVar, this.f64646a, this.f64647b.nativeLibraryDir);
    }

    @Override // com.bilibili.lib.tribe.core.internal.loader.a
    @Nullable
    public final f d(@NotNull String str) {
        ReentrantReadWriteLock.ReadLock lock = this.f64649d.readLock();
        lock.lock();
        try {
            return this.f64650e.get(str);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.bilibili.lib.tribe.core.internal.loader.a
    public final void e(@NotNull InterfaceC1965A interfaceC1965A) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f64649d.writeLock();
        writeLock.lock();
        try {
            j(interfaceC1965A);
            Unit unit = Unit.INSTANCE;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.bilibili.lib.tribe.core.internal.loader.a
    public final void f(@NotNull f fVar) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f64649d.writeLock();
        writeLock.lock();
        try {
            this.f64650e.put(fVar.getOwner().getName(), fVar);
            j(fVar.getOwner());
            Unit unit = Unit.INSTANCE;
        } finally {
            writeLock.unlock();
        }
    }

    @NotNull
    public final String g() {
        ReentrantReadWriteLock.ReadLock lock = this.f64649d.readLock();
        lock.lock();
        try {
            final int i7 = 0;
            return CollectionsKt.p(this.f64650e.values(), ", ", "[", "]", new Function1(i7) { // from class: If0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f10283a;

                {
                    this.f10283a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f10283a) {
                        case 0:
                            x owner = ((f) obj).getOwner();
                            return i5.d.a(owner.getVersionCode(), owner.getName(), ":");
                        default:
                            ((MutableBundleLike) obj).remove("auto_send_msg");
                            return Unit.INSTANCE;
                    }
                }
            }, 24);
        } finally {
            lock.unlock();
        }
    }

    public final Class<?> h(String str) {
        Class<?> clsK;
        ReentrantReadWriteLock.ReadLock lock = this.f64649d.readLock();
        lock.lock();
        try {
            C2291a c2291a = this.f64651f.get(str);
            if (c2291a == null) {
                Iterator<Map.Entry<String, f>> it = this.f64650e.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().getValue().b(str);
                    } catch (ClassNotFoundException e7) {
                    }
                }
                throw new ClassNotFoundException("Class " + str + " not found from all bundle loaders.");
            }
            f fVar = this.f64650e.get(c2291a.f10276a);
            if (fVar != null) {
                try {
                    clsK = fVar.findClass(str);
                } catch (ClassNotFoundException e8) {
                    if (!Intrinsics.areEqual(c2291a.f10277b.getType(), "provider")) {
                        throw e8;
                    }
                    clsK = k(c2291a);
                }
            } else {
                clsK = k(c2291a);
            }
            lock.unlock();
            return clsK;
        } finally {
            lock.unlock();
        }
    }

    @NotNull
    public final Class<?> i(@NotNull String str) throws ClassNotFoundException {
        Class<?> clsH;
        try {
            return Object.class.getClassLoader().loadClass(str);
        } catch (ClassNotFoundException e7) {
            try {
                clsH = h(str);
            } catch (ClassNotFoundException e8) {
                try {
                    if (!((Boolean) this.f64648c.invoke()).booleanValue()) {
                        throw e8;
                    }
                    clsH = h(str);
                } catch (ClassNotFoundException e9) {
                    try {
                        return this.f64646a.loadClass(str);
                    } catch (ClassNotFoundException e10) {
                        ExceptionsKt.addSuppressed(e10, e9);
                        throw e10;
                    }
                }
            }
            return clsH;
        }
    }

    public final void j(InterfaceC1969d interfaceC1969d) {
        for (InterfaceC1643b interfaceC1643b : interfaceC1969d.getComponents()) {
            this.f64651f.put(interfaceC1643b.getName(), new C2291a(interfaceC1969d.getName(), interfaceC1643b));
        }
    }
}
