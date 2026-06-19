package com.bilibili.ogv.kmm.operation.following;

import Fg.G;
import I.E;
import J2.g;
import M3.C2562a;
import M3.C2565b;
import M3.C2568c;
import M3.C2571d;
import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import c6.N;
import com.bilibili.ogv.kmm.operation.api.d;
import com.bilibili.ogv.kmm.operation.api.j;
import com.bilibili.ogv.kmm.operation.api.k;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing.class */
@StabilityInferred(parameters = 0)
@ModuleTypeNames(names = {"FOLLOW_C_V2"})
@Serializable
public final class BangumiFollowing implements InterfaceC5118d, d, InterfaceC8453a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68296f = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new G(6)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f68298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f68300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68301e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<BangumiFollowing> serializer() {
            return BangumiFollowing$$serializer.f68302a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class b implements InterfaceC7871a, InterfaceC8453a {

        @NotNull
        public static final C0408b Companion = new C0408b();

        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final k f68307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final List<String> f68308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68310g;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68312b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.following.BangumiFollowing$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68311a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.following.BangumiFollowing.Item", (GeneratedSerializer) obj, 7);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("progress_percent", true);
                pluginGeneratedSerialDescriptor.addElement("new_ep", false);
                pluginGeneratedSerialDescriptor.addElement("covers", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f68312b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(k.a.f68010a), lazyArr[4].getValue(), stringSerializer, lazyArr[6].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int iDecodeIntElement;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                Map map;
                int i7;
                String str;
                List list;
                k kVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68312b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                    kVar = (k) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, k.a.f68010a, (Object) null);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), (Object) null);
                    String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), (Object) null);
                    i7 = 127;
                    str = strDecodeStringElement3;
                } else {
                    boolean z6 = true;
                    iDecodeIntElement = 0;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    k kVar2 = null;
                    List list2 = null;
                    String strDecodeStringElement4 = null;
                    map = null;
                    i7 = 0;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i7 |= 1;
                                break;
                            case 1:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                break;
                            case 2:
                                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                kVar2 = (k) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, k.a.f68010a, kVar2);
                                i7 |= 8;
                                break;
                            case 4:
                                list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list2);
                                i7 |= 16;
                                break;
                            case 5:
                                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i7 |= 32;
                                break;
                            case 6:
                                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), map);
                                i7 |= 64;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    str = strDecodeStringElement4;
                    list = list2;
                    kVar = kVar2;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i7, strDecodeStringElement, strDecodeStringElement2, iDecodeIntElement, kVar, list, str, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68312b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68312b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                C0408b c0408b = b.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(bVar.f68304a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, bVar.f68304a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(bVar.f68305b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bVar.f68305b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || bVar.f68306c != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 2, bVar.f68306c);
                }
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, k.a.f68010a, bVar.f68307d);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                Lazy<KSerializer<Object>>[] lazyArr = b.h;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(bVar.f68308e, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), bVar.f68308e);
                }
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                String str = bVar.f68309f;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, str);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(bVar.f68310g, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), bVar.f68310g);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.following.BangumiFollowing$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$b$b.class */
        public static final class C0408b {
            @NotNull
            public final KSerializer<b> serializer() {
                return a.f68311a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C2562a(5)), null, LazyKt.lazy(lazyThreadSafetyMode, new C2565b(6))};
        }

        public b(int i7, String str, String str2, int i8, k kVar, List list, String str3, Map map) {
            if (8 != (i7 & 8)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 8, a.f68312b);
            }
            if ((i7 & 1) == 0) {
                this.f68304a = "";
            } else {
                this.f68304a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68305b = "";
            } else {
                this.f68305b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f68306c = 0;
            } else {
                this.f68306c = i8;
            }
            this.f68307d = kVar;
            if ((i7 & 16) == 0) {
                this.f68308e = CollectionsKt.emptyList();
            } else {
                this.f68308e = list;
            }
            if ((i7 & 32) == 0) {
                this.f68309f = "";
            } else {
                this.f68309f = str3;
            }
            if ((i7 & 64) == 0) {
                this.f68310g = MapsKt.emptyMap();
            } else {
                this.f68310g = map;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f68304a, bVar.f68304a) && Intrinsics.areEqual(this.f68305b, bVar.f68305b) && this.f68306c == bVar.f68306c && Intrinsics.areEqual(this.f68307d, bVar.f68307d) && Intrinsics.areEqual(this.f68308e, bVar.f68308e) && Intrinsics.areEqual(this.f68309f, bVar.f68309f) && Intrinsics.areEqual(this.f68310g, bVar.f68310g);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68310g;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f68309f;
        }

        public final int hashCode() {
            int iA = I.a(this.f68306c, E.a(this.f68304a.hashCode() * 31, 31, this.f68305b), 31);
            k kVar = this.f68307d;
            return this.f68310g.hashCode() + E.a(e0.a((iA + (kVar == null ? 0 : kVar.f68009a.hashCode())) * 31, 31, this.f68308e), 31, this.f68309f);
        }

        @NotNull
        public final String toString() {
            List<String> list = this.f68308e;
            Map<String, String> map = this.f68310g;
            StringBuilder sb = new StringBuilder("Item(title=");
            sb.append(this.f68304a);
            sb.append(", sub_title=");
            sb.append(this.f68305b);
            sb.append(", progress_percent=");
            sb.append(this.f68306c);
            sb.append(", new_ep=");
            sb.append(this.f68307d);
            sb.append(", covers=");
            sb.append(list);
            sb.append(", url=");
            return C4665g.a(sb, this.f68309f, ", report=", map, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68313d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<b> f68315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<j> f68316c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68318b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.following.BangumiFollowing$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68317a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.following.BangumiFollowing.ModuleData", (GeneratedSerializer) obj, 3);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("headers", true);
                f68318b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f68313d;
                return new KSerializer[]{StringSerializer.INSTANCE, lazyArr[1].getValue(), lazyArr[2].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                List list;
                List list2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68318b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68313d;
                String strDecodeStringElement = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                    i7 = 7;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    list = null;
                    list2 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list);
                            i7 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                            i7 |= 4;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(list, list2, strDecodeStringElement, i7);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68318b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68318b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(cVar.f68314a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cVar.f68314a);
                }
                Lazy<KSerializer<Object>>[] lazyArr = c.f68313d;
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), cVar.f68315b);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(cVar.f68316c, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), cVar.f68316c);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/BangumiFollowing$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return a.f68317a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68313d = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new C2568c(6)), LazyKt.lazy(lazyThreadSafetyMode, new C2571d(8))};
        }

        public c(List list, List list2, String str, int i7) {
            if (2 != (i7 & 2)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 2, a.f68318b);
            }
            this.f68314a = (i7 & 1) == 0 ? "" : str;
            this.f68315b = list;
            if ((i7 & 4) == 0) {
                this.f68316c = CollectionsKt.emptyList();
            } else {
                this.f68316c = list2;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f68314a, cVar.f68314a) && Intrinsics.areEqual(this.f68315b, cVar.f68315b) && Intrinsics.areEqual(this.f68316c, cVar.f68316c);
        }

        public final int hashCode() {
            return this.f68316c.hashCode() + e0.a(this.f68314a.hashCode() * 31, 31, this.f68315b);
        }

        @NotNull
        public final String toString() {
            List<b> list = this.f68315b;
            List<j> list2 = this.f68316c;
            StringBuilder sb = new StringBuilder("ModuleData(url=");
            f.a(this.f68314a, ", items=", ", headers=", sb, list);
            return N.a(sb, ")", list2);
        }
    }

    public BangumiFollowing(int i7, String str, c cVar, Map map, String str2, long j7) {
        if (27 != (i7 & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 27, BangumiFollowing$$serializer.f68303b);
        }
        this.f68297a = str;
        this.f68298b = cVar;
        if ((i7 & 4) == 0) {
            this.f68299c = MapsKt.emptyMap();
        } else {
            this.f68299c = map;
        }
        this.f68300d = str2;
        this.f68301e = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiFollowing)) {
            return false;
        }
        BangumiFollowing bangumiFollowing = (BangumiFollowing) obj;
        return Intrinsics.areEqual(this.f68297a, bangumiFollowing.f68297a) && Intrinsics.areEqual(this.f68298b, bangumiFollowing.f68298b) && Intrinsics.areEqual(this.f68299c, bangumiFollowing.f68299c) && Intrinsics.areEqual(this.f68300d, bangumiFollowing.f68300d) && this.f68301e == bangumiFollowing.f68301e;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68301e;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68299c;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68300d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68301e) + E.a(g.a((this.f68298b.hashCode() + (this.f68297a.hashCode() * 31)) * 31, this.f68299c, 31), 31, this.f68300d);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f68299c;
        StringBuilder sb = new StringBuilder("BangumiFollowing(title=");
        sb.append(this.f68297a);
        sb.append(", module_data=");
        sb.append(this.f68298b);
        sb.append(", report=");
        sb.append(map);
        sb.append(", type=");
        sb.append(this.f68300d);
        sb.append(", id=");
        return android.support.v4.media.session.a.a(sb, this.f68301e, ")");
    }
}
