package com.bilibili.ogv.kmm.operation.banner;

import F3.C6;
import F3.D6;
import F3.E6;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import h6.C7416u;
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
import kotlinx.serialization.SerialName;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a.class */
@SerialName("BANNER")
@StabilityInferred(parameters = 0)
@Serializable
public final class C5437a implements InterfaceC5118d, com.bilibili.ogv.kmm.operation.api.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68067d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C6(9)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yk0.c<List<d>> f68068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68070c;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0398a implements GeneratedSerializer<C5437a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0398a f68071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68072b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.banner.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68071a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("BANNER", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("type", false);
            f68072b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{C5437a.f68067d[0].getValue(), LongSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            int i7;
            String strDecodeStringElement;
            Yk0.c cVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68072b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = C5437a.f68067d;
            Yk0.c cVar2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                cVar = (Yk0.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                i7 = 7;
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            } else {
                jDecodeLongElement = 0;
                boolean z6 = true;
                i7 = 0;
                String strDecodeStringElement2 = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        cVar2 = (Yk0.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), cVar2);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    }
                }
                strDecodeStringElement = strDecodeStringElement2;
                cVar = cVar2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5437a(i7, cVar, jDecodeLongElement, strDecodeStringElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68072b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            C5437a c5437a = (C5437a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68072b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) C5437a.f68067d[0].getValue(), c5437a.f68068a);
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, c5437a.f68069b);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, c5437a.f68070c);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class b {

        @NotNull
        public static final C0400b Companion = new C0400b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final e f68073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final e f68074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final e f68075c;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0399a implements GeneratedSerializer<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0399a f68076a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68077b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.banner.a$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68076a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.banner.Banner.BannerModResource", (GeneratedSerializer) obj, 3);
                pluginGeneratedSerialDescriptor.addElement("hdr_video_file", true);
                pluginGeneratedSerialDescriptor.addElement("hdr_image_file", true);
                pluginGeneratedSerialDescriptor.addElement("pop_animation_file", true);
                f68077b = pluginGeneratedSerialDescriptor;
            }

            @NotNull
            public final KSerializer<?>[] childSerializers() {
                e.C0402a c0402a = e.C0402a.f68096a;
                return new KSerializer[]{BuiltinSerializersKt.getNullable(c0402a), BuiltinSerializersKt.getNullable(c0402a), BuiltinSerializersKt.getNullable(c0402a)};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                e eVar;
                e eVar2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68077b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                e eVar3 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    e.C0402a c0402a = e.C0402a.f68096a;
                    eVar3 = (e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, c0402a, (Object) null);
                    eVar = (e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, c0402a, (Object) null);
                    eVar2 = (e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, c0402a, (Object) null);
                    i7 = 7;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    e eVar4 = null;
                    e eVar5 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            eVar3 = (e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, e.C0402a.f68096a, eVar3);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            eVar4 = (e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, e.C0402a.f68096a, eVar4);
                            i7 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            eVar5 = (e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, e.C0402a.f68096a, eVar5);
                            i7 |= 4;
                        }
                    }
                    e eVar6 = eVar5;
                    eVar = eVar4;
                    eVar2 = eVar6;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i7, eVar3, eVar, eVar2);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68077b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68077b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                C0400b c0400b = b.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || bVar.f68073a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, e.C0402a.f68096a, bVar.f68073a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || bVar.f68074b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, e.C0402a.f68096a, bVar.f68074b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || bVar.f68075c != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, e.C0402a.f68096a, bVar.f68075c);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$b$b.class */
        public static final class C0400b {
            @NotNull
            public final KSerializer<b> serializer() {
                return C0399a.f68076a;
            }
        }

        public b() {
            this.f68073a = null;
            this.f68074b = null;
            this.f68075c = null;
        }

        public b(int i7, e eVar, e eVar2, e eVar3) {
            if ((i7 & 1) == 0) {
                this.f68073a = null;
            } else {
                this.f68073a = eVar;
            }
            if ((i7 & 2) == 0) {
                this.f68074b = null;
            } else {
                this.f68074b = eVar2;
            }
            if ((i7 & 4) == 0) {
                this.f68075c = null;
            } else {
                this.f68075c = eVar3;
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
            return Intrinsics.areEqual(this.f68073a, bVar.f68073a) && Intrinsics.areEqual(this.f68074b, bVar.f68074b) && Intrinsics.areEqual(this.f68075c, bVar.f68075c);
        }

        public final int hashCode() {
            int iHashCode = 0;
            e eVar = this.f68073a;
            int iHashCode2 = eVar == null ? 0 : eVar.hashCode();
            e eVar2 = this.f68074b;
            int iHashCode3 = eVar2 == null ? 0 : eVar2.hashCode();
            e eVar3 = this.f68075c;
            if (eVar3 != null) {
                iHashCode = eVar3.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "BannerModResource(hdr_video_file=" + this.f68073a + ", hdr_image_file=" + this.f68074b + ", pop_animation_file=" + this.f68075c + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$c.class */
    public static final class c {
        @NotNull
        public final KSerializer<C5437a> serializer() {
            return C0398a.f68071a;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$d.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class d implements InterfaceC7871a, InterfaceC8453a {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68078l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f68079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f68085g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68086i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.operation3.module.operablecard.a> f68087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final b f68088k;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$d$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0401a implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0401a f68089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68090b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.banner.a$d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68089a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.banner.Banner.Item", (GeneratedSerializer) obj, 11);
                pluginGeneratedSerialDescriptor.addElement("oid", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("bg_img", true);
                pluginGeneratedSerialDescriptor.addElement("img_badge", true);
                pluginGeneratedSerialDescriptor.addElement("item_type", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                pluginGeneratedSerialDescriptor.addElement("sub_items", true);
                pluginGeneratedSerialDescriptor.addElement("banner_mod_resource", true);
                f68090b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = d.f68078l;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, lazyArr[8].getValue(), lazyArr[9].getValue(), BuiltinSerializersKt.getNullable(b.C0399a.f68076a)};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                long jDecodeLongElement;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String str;
                b bVar;
                List list;
                Map map;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                String str2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68090b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.f68078l;
                String strDecodeStringElement5 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), (Object) null);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), (Object) null);
                    bVar = (b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 10, b.C0399a.f68076a, (Object) null);
                    i7 = 2047;
                    str2 = strDecodeStringElement6;
                    str = strDecodeStringElement7;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    b bVar2 = null;
                    List list2 = null;
                    Map map2 = null;
                    String strDecodeStringElement8 = null;
                    String strDecodeStringElement9 = null;
                    String strDecodeStringElement10 = null;
                    String strDecodeStringElement11 = null;
                    jDecodeLongElement = 0;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                i7 |= 1;
                                break;
                            case 1:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                break;
                            case 2:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i7 |= 16;
                                break;
                            case 5:
                                strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i7 |= 32;
                                break;
                            case 6:
                                strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                                i7 |= 64;
                                break;
                            case 7:
                                strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                                i7 |= 128;
                                break;
                            case 8:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), map2);
                                i7 |= 256;
                                break;
                            case 9:
                                list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), list2);
                                i7 |= 512;
                                break;
                            case 10:
                                bVar2 = (b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 10, b.C0399a.f68076a, bVar2);
                                i7 |= 1024;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    String str3 = strDecodeStringElement8;
                    str = strDecodeStringElement9;
                    String str4 = strDecodeStringElement10;
                    String str5 = strDecodeStringElement11;
                    bVar = bVar2;
                    list = list2;
                    map = map2;
                    strDecodeStringElement3 = str5;
                    strDecodeStringElement4 = str4;
                    str2 = str3;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i7, jDecodeLongElement, strDecodeStringElement5, strDecodeStringElement, strDecodeStringElement2, str2, str, strDecodeStringElement4, strDecodeStringElement3, map, list, bVar);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68090b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68090b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = d.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || dVar.f68079a != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, dVar.f68079a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(dVar.f68080b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, dVar.f68080b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(dVar.f68081c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, dVar.f68081c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(dVar.f68082d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, dVar.f68082d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(dVar.f68083e, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, dVar.f68083e);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || !Intrinsics.areEqual(dVar.f68084f, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, dVar.f68084f);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(dVar.f68085g, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, dVar.f68085g);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(dVar.h, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, dVar.h);
                }
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
                Lazy<KSerializer<Object>>[] lazyArr = d.f68078l;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(dVar.f68086i, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), dVar.f68086i);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(dVar.f68087j, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), dVar.f68087j);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || dVar.f68088k != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 10, b.C0399a.f68076a, dVar.f68088k);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$d$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$d$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<d> serializer() {
                return C0401a.f68089a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68078l = new Lazy[]{null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new D6(8)), LazyKt.lazy(lazyThreadSafetyMode, new D50.d(7)), null};
        }

        public d() {
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            List<com.bilibili.ogv.operation3.module.operablecard.a> listEmptyList = CollectionsKt.emptyList();
            this.f68079a = 0L;
            this.f68080b = "";
            this.f68081c = "";
            this.f68082d = "";
            this.f68083e = "";
            this.f68084f = "";
            this.f68085g = "";
            this.h = "";
            this.f68086i = mapEmptyMap;
            this.f68087j = listEmptyList;
            this.f68088k = null;
        }

        public d(int i7, long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, List list, b bVar) {
            this.f68079a = (i7 & 1) == 0 ? 0L : j7;
            if ((i7 & 2) == 0) {
                this.f68080b = "";
            } else {
                this.f68080b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68081c = "";
            } else {
                this.f68081c = str2;
            }
            if ((i7 & 8) == 0) {
                this.f68082d = "";
            } else {
                this.f68082d = str3;
            }
            if ((i7 & 16) == 0) {
                this.f68083e = "";
            } else {
                this.f68083e = str4;
            }
            if ((i7 & 32) == 0) {
                this.f68084f = "";
            } else {
                this.f68084f = str5;
            }
            if ((i7 & 64) == 0) {
                this.f68085g = "";
            } else {
                this.f68085g = str6;
            }
            if ((i7 & 128) == 0) {
                this.h = "";
            } else {
                this.h = str7;
            }
            if ((i7 & 256) == 0) {
                this.f68086i = MapsKt.emptyMap();
            } else {
                this.f68086i = map;
            }
            if ((i7 & 512) == 0) {
                this.f68087j = CollectionsKt.emptyList();
            } else {
                this.f68087j = list;
            }
            if ((i7 & 1024) == 0) {
                this.f68088k = null;
            } else {
                this.f68088k = bVar;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f68079a == dVar.f68079a && Intrinsics.areEqual(this.f68080b, dVar.f68080b) && Intrinsics.areEqual(this.f68081c, dVar.f68081c) && Intrinsics.areEqual(this.f68082d, dVar.f68082d) && Intrinsics.areEqual(this.f68083e, dVar.f68083e) && Intrinsics.areEqual(this.f68084f, dVar.f68084f) && Intrinsics.areEqual(this.f68085g, dVar.f68085g) && Intrinsics.areEqual(this.h, dVar.h) && Intrinsics.areEqual(this.f68086i, dVar.f68086i) && Intrinsics.areEqual(this.f68087j, dVar.f68087j) && Intrinsics.areEqual(this.f68088k, dVar.f68088k);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68086i;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.h;
        }

        public final int hashCode() {
            int iA = e0.a(J2.g.a(I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(Long.hashCode(this.f68079a) * 31, 31, this.f68080b), 31, this.f68081c), 31, this.f68082d), 31, this.f68083e), 31, this.f68084f), 31, this.f68085g), 31, this.h), this.f68086i, 31), 31, this.f68087j);
            b bVar = this.f68088k;
            return iA + (bVar == null ? 0 : bVar.hashCode());
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f68086i;
            List<com.bilibili.ogv.operation3.module.operablecard.a> list = this.f68087j;
            StringBuilder sb = new StringBuilder("Item(oid=");
            sb.append(this.f68079a);
            sb.append(", title=");
            sb.append(this.f68080b);
            sb.append(", cover=");
            sb.append(this.f68081c);
            sb.append(", subtitle=");
            sb.append(this.f68082d);
            sb.append(", bg_img=");
            sb.append(this.f68083e);
            sb.append(", img_badge=");
            sb.append(this.f68084f);
            sb.append(", item_type=");
            sb.append(this.f68085g);
            sb.append(", url=");
            C7416u.a(sb, this.h, ", report=", map, ", sub_items=");
            sb.append(list);
            sb.append(", banner_mod_resource=");
            sb.append(this.f68088k);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$e.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class e {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68091e = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new E6(8))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68095d;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$e$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0402a implements GeneratedSerializer<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0402a f68096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68097b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.banner.a$e$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68096a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.banner.Banner.ModInfo", (GeneratedSerializer) obj, 4);
                pluginGeneratedSerialDescriptor.addElement("mod_pool", false);
                pluginGeneratedSerialDescriptor.addElement("resource_name", false);
                pluginGeneratedSerialDescriptor.addElement("file_name", false);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f68097b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = e.f68091e;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, lazyArr[3].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                Map map;
                String strDecodeStringElement2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68097b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e.f68091e;
                String strDecodeStringElement3 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
                    i7 = 15;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    strDecodeStringElement = null;
                    String strDecodeStringElement4 = null;
                    Map map2 = null;
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
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i7 |= 4;
                        } else {
                            if (iDecodeElementIndex != 3) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), map2);
                            i7 |= 8;
                        }
                    }
                    String str = strDecodeStringElement4;
                    map = map2;
                    strDecodeStringElement2 = str;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new e(i7, strDecodeStringElement3, strDecodeStringElement, strDecodeStringElement2, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68097b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68097b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, eVar.f68092a);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, eVar.f68093b);
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, eVar.f68094c);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(eVar.f68095d, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) e.f68091e[3].getValue(), eVar.f68095d);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.a$e$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/a$e$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<e> serializer() {
                return C0402a.f68096a;
            }
        }

        public e(int i7, String str, String str2, String str3, Map map) {
            if (7 != (i7 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 7, C0402a.f68097b);
            }
            this.f68092a = str;
            this.f68093b = str2;
            this.f68094c = str3;
            if ((i7 & 8) == 0) {
                this.f68095d = MapsKt.emptyMap();
            } else {
                this.f68095d = map;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f68092a, eVar.f68092a) && Intrinsics.areEqual(this.f68093b, eVar.f68093b) && Intrinsics.areEqual(this.f68094c, eVar.f68094c) && Intrinsics.areEqual(this.f68095d, eVar.f68095d);
        }

        public final int hashCode() {
            return this.f68095d.hashCode() + I.E.a(I.E.a(this.f68092a.hashCode() * 31, 31, this.f68093b), 31, this.f68094c);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f68095d;
            StringBuilder sb = new StringBuilder("ModInfo(mod_pool=");
            sb.append(this.f68092a);
            sb.append(", resource_name=");
            sb.append(this.f68093b);
            sb.append(", file_name=");
            return C4665g.a(sb, this.f68094c, ", report=", map, ")");
        }
    }

    public C5437a(int i7, Yk0.c cVar, long j7, String str) {
        if (7 != (i7 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 7, C0398a.f68072b);
        }
        this.f68068a = cVar;
        this.f68069b = j7;
        this.f68070c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5437a)) {
            return false;
        }
        C5437a c5437a = (C5437a) obj;
        return Intrinsics.areEqual(this.f68068a, c5437a.f68068a) && this.f68069b == c5437a.f68069b && Intrinsics.areEqual(this.f68070c, c5437a.f68070c);
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68069b;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68070c;
    }

    public final int hashCode() {
        return this.f68070c.hashCode() + C3554n0.a(this.f68068a.hashCode() * 31, 31, this.f68069b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Banner(module_data=");
        sb.append(this.f68068a);
        sb.append(", id=");
        sb.append(this.f68069b);
        sb.append(", type=");
        return C8770a.a(sb, this.f68070c, ")");
    }
}
