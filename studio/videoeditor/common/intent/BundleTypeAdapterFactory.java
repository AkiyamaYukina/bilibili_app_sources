package com.bilibili.studio.videoeditor.common.intent;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/common/intent/BundleTypeAdapterFactory.class */
public class BundleTypeAdapterFactory implements i {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/common/intent/BundleTypeAdapterFactory$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f109425a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x007d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a = r0
                r0 = r4
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L71 java.lang.NoSuchFieldError -> L75
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L75
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L75
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L75
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L75 java.lang.NoSuchFieldError -> L79
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L79 java.lang.NoSuchFieldError -> L7d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L58:
                int[] r0 = com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.f109425a     // Catch: java.lang.NoSuchFieldError -> L7d java.lang.NoSuchFieldError -> L81
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L81
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L81
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L81
            L64:
                return
            L65:
                r4 = move-exception
                goto L14
            L69:
                r4 = move-exception
                goto L1f
            L6d:
                r4 = move-exception
                goto L2a
            L71:
                r4 = move-exception
                goto L35
            L75:
                r4 = move-exception
                goto L40
            L79:
                r4 = move-exception
                goto L4c
            L7d:
                r4 = move-exception
                goto L58
            L81:
                r4 = move-exception
                goto L64
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.a.m10427clinit():void");
        }
    }

    public final <T> TypeAdapter<T> a(Gson gson, TypeToken<T> typeToken) {
        if (Bundle.class.isAssignableFrom(typeToken.getRawType())) {
            return (TypeAdapter<T>) new TypeAdapter<Bundle>(gson) { // from class: com.bilibili.studio.videoeditor.common.intent.BundleTypeAdapterFactory.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Gson f109424a;

                {
                    this.f109424a = gson;
                }

                public static List g(fN0.a aVar) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    aVar.c();
                    while (aVar.E() != JsonToken.END_OBJECT) {
                        int i7 = a.f109425a[aVar.E().ordinal()];
                        if (i7 == 3) {
                            arrayList.add(new Pair(aVar.w(), h(aVar)));
                        } else if (i7 != 4) {
                            throw new IOException("expecting object: " + aVar.getPath());
                        }
                    }
                    aVar.g();
                    return arrayList;
                }

                public static Object h(fN0.a aVar) throws IOException {
                    Object objValueOf;
                    int i7 = a.f109425a[aVar.E().ordinal()];
                    if (i7 == 1) {
                        aVar.y();
                        return null;
                    }
                    if (i7 == 2) {
                        return g(aVar);
                    }
                    if (i7 == 5) {
                        List arrayList = new ArrayList();
                        aVar.b();
                        while (aVar.E() != JsonToken.END_ARRAY) {
                            arrayList = (List) h(aVar);
                        }
                        aVar.f();
                        return arrayList;
                    }
                    if (i7 == 6) {
                        return Boolean.valueOf(aVar.q());
                    }
                    if (i7 != 7) {
                        if (i7 == 8) {
                            return aVar.B();
                        }
                        throw new IOException("expecting value: " + aVar.getPath());
                    }
                    double dS = aVar.s();
                    if (dS - Math.ceil(dS) == 0.0d) {
                        long j7 = (long) dS;
                        objValueOf = (j7 < -2147483648L || j7 > 2147483647L) ? Long.valueOf(j7) : Integer.valueOf((int) j7);
                    } else {
                        objValueOf = Double.valueOf(dS);
                    }
                    return objValueOf;
                }

                public static Bundle i(List list) throws IOException {
                    Bundle bundle = new Bundle();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str = (String) pair.first;
                        Object obj = pair.second;
                        if (obj instanceof String) {
                            bundle.putString(str, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(str, ((Double) obj).doubleValue());
                        } else if (obj instanceof Parcelable) {
                            bundle.putParcelable(str, (Parcelable) obj);
                        } else if (obj instanceof List) {
                            bundle.putParcelable(str, i((List) obj));
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IOException("Unparcelable key, value: " + str + ", " + obj);
                            }
                            bundle.putFloat(str, ((Float) obj).floatValue());
                        }
                    }
                    return bundle;
                }

                public final Object e(fN0.a aVar) throws IOException {
                    Bundle bundleI;
                    int i7 = a.f109425a[aVar.E().ordinal()];
                    if (i7 == 1) {
                        aVar.y();
                        bundleI = null;
                    } else {
                        if (i7 != 2) {
                            throw new IOException("expecting object: " + aVar.getPath());
                        }
                        bundleI = i(g(aVar));
                    }
                    return bundleI;
                }

                public final void f(fN0.b bVar, Object obj) throws IOException {
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null) {
                        bVar.n();
                        return;
                    }
                    bVar.d();
                    for (String str : bundle.keySet()) {
                        bVar.k(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 == null) {
                            bVar.n();
                        } else {
                            this.f109424a.toJson(obj2, obj2.getClass(), bVar);
                        }
                    }
                    bVar.g();
                }
            };
        }
        return null;
    }
}
