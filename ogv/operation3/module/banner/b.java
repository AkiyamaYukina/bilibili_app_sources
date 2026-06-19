package com.bilibili.ogv.operation3.module.banner;

import I.E;
import J3.C2393x1;
import J3.C2396y1;
import J3.C2399z1;
import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import h6.C7416u;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/b.class */
@SerialName("banner_v3")
@StabilityInferred(parameters = 0)
@Serializable
public final class b implements InterfaceC8453a, InterfaceC5118d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71119c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<C0442b> f71120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f71121b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/b$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71123b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.banner.b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71122a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("banner_v3", (GeneratedSerializer) obj, 2);
            pluginGeneratedSerialDescriptor.addElement("items", false);
            pluginGeneratedSerialDescriptor.addElement("report", false);
            f71123b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = b.f71119c;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            Map map;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71123b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = b.f71119c;
            List list = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                i7 = 3;
            } else {
                boolean z6 = true;
                i7 = 0;
                map = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                        i7 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map);
                        i7 |= 2;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new b(i7, list, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71123b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            b bVar = (b) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71123b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = b.f71119c;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), bVar.f71120a);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), bVar.f71121b);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.banner.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/b$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class C0442b implements InterfaceC8453a, InterfaceC7871a {

        @NotNull
        public static final C0443b Companion = new C0443b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f71124e = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C2399z1(8)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f71125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f71126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f71127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f71128d;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.banner.b$b$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/b$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<C0442b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f71129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f71130b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.banner.b$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f71129a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.banner.BannerV3.BannerItem", (GeneratedSerializer) obj, 4);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("cover", false);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                pluginGeneratedSerialDescriptor.addElement("link", false);
                f71130b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = C0442b.f71124e;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, lazyArr[2].getValue(), stringSerializer};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                Map map;
                String strDecodeStringElement2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71130b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = C0442b.f71124e;
                String strDecodeStringElement3 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    i7 = 15;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    strDecodeStringElement = null;
                    Map map2 = null;
                    String strDecodeStringElement4 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                        } else if (iDecodeElementIndex == 2) {
                            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map2);
                            i7 |= 4;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                        }
                    }
                    String str = strDecodeStringElement4;
                    map = map2;
                    strDecodeStringElement2 = str;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new C0442b(i7, strDecodeStringElement3, strDecodeStringElement, strDecodeStringElement2, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f71130b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                C0442b c0442b = (C0442b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71130b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                C0443b c0443b = C0442b.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(c0442b.f71125a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, c0442b.f71125a);
                }
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, c0442b.f71126b);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(c0442b.f71127c, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) C0442b.f71124e[2].getValue(), c0442b.f71127c);
                }
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, c0442b.f71128d);
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.banner.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/b$b$b.class */
        public static final class C0443b {
            @NotNull
            public final KSerializer<C0442b> serializer() {
                return a.f71129a;
            }
        }

        public C0442b(int i7, String str, String str2, String str3, Map map) {
            if (10 != (i7 & 10)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 10, a.f71130b);
            }
            this.f71125a = (i7 & 1) == 0 ? "" : str;
            this.f71126b = str2;
            if ((i7 & 4) == 0) {
                this.f71127c = MapsKt.emptyMap();
            } else {
                this.f71127c = map;
            }
            this.f71128d = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0442b)) {
                return false;
            }
            C0442b c0442b = (C0442b) obj;
            return Intrinsics.areEqual(this.f71125a, c0442b.f71125a) && Intrinsics.areEqual(this.f71126b, c0442b.f71126b) && Intrinsics.areEqual(this.f71127c, c0442b.f71127c) && Intrinsics.areEqual(this.f71128d, c0442b.f71128d);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f71127c;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f71128d;
        }

        public final int hashCode() {
            return this.f71128d.hashCode() + J2.g.a(E.a(this.f71125a.hashCode() * 31, 31, this.f71126b), this.f71127c, 31);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f71127c;
            StringBuilder sb = new StringBuilder("BannerItem(title=");
            sb.append(this.f71125a);
            sb.append(", cover=");
            C7416u.a(sb, this.f71126b, ", report=", map, ", url=");
            return C8770a.a(sb, this.f71128d, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/b$c.class */
    public static final class c {
        @NotNull
        public final KSerializer<b> serializer() {
            return a.f71122a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71119c = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new C2393x1(10)), LazyKt.lazy(lazyThreadSafetyMode, new C2396y1(8))};
    }

    public b(int i7, List list, Map map) {
        if (3 != (i7 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 3, a.f71123b);
        }
        this.f71120a = list;
        this.f71121b = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f71120a, bVar.f71120a) && Intrinsics.areEqual(this.f71121b, bVar.f71121b);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f71121b;
    }

    public final int hashCode() {
        return this.f71121b.hashCode() + (this.f71120a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BannerV3(items=" + this.f71120a + ", report=" + this.f71121b + ")";
    }
}
