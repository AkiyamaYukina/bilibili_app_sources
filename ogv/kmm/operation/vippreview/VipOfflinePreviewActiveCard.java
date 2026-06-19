package com.bilibili.ogv.kmm.operation.vippreview;

import I.E;
import K7.M;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.vippreview.a;
import h6.C7416u;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import sj0.C8595a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard.class */
@SerialName("SPOT_SCREENING")
@StabilityInferred(parameters = 0)
@Serializable
public final class VipOfflinePreviewActiveCard implements InterfaceC5118d, InterfaceC8453a, com.bilibili.ogv.kmm.operation.api.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68881f = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new K3.f(6)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f68882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f68886e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$Type.class */
    public static final class Type {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;

        @SerialName("1")
        public static final Type RESERVATION = new Type("RESERVATION", 0);

        @SerialName("2")
        public static final Type REGISTRATION = new Type("REGISTRATION", 1);

        @SerialName("3")
        public static final Type RECALL = new Type("RECALL", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{RESERVATION, REGISTRATION, RECALL};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private Type(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<VipOfflinePreviewActiveCard> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68888b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68887a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SPOT_SCREENING", (GeneratedSerializer) obj, 5);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("type", false);
            f68888b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = VipOfflinePreviewActiveCard.f68881f;
            d.a aVar = d.a.f68908a;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{aVar, stringSerializer, lazyArr[2].getValue(), LongSerializer.INSTANCE, stringSerializer};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            long jDecodeLongElement;
            int i7;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            Map map;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68888b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = VipOfflinePreviewActiveCard.f68881f;
            d dVar = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68908a, (Object) null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                i7 = 31;
            } else {
                jDecodeLongElement = 0;
                boolean z6 = true;
                i7 = 0;
                strDecodeStringElement = null;
                Map map2 = null;
                String strDecodeStringElement3 = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68908a, dVar);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map2);
                        i7 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 3);
                        i7 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                        i7 |= 16;
                    }
                }
                Map map3 = map2;
                strDecodeStringElement2 = strDecodeStringElement3;
                map = map3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new VipOfflinePreviewActiveCard(i7, dVar, strDecodeStringElement, map, jDecodeLongElement, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68888b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard = (VipOfflinePreviewActiveCard) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68888b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = VipOfflinePreviewActiveCard.Companion;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68908a, vipOfflinePreviewActiveCard.f68882a);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
            String str = vipOfflinePreviewActiveCard.f68883b;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(vipOfflinePreviewActiveCard.f68884c, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) VipOfflinePreviewActiveCard.f68881f[2].getValue(), vipOfflinePreviewActiveCard.f68884c);
            }
            compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 3, vipOfflinePreviewActiveCard.f68885d);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, vipOfflinePreviewActiveCard.f68886e);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<VipOfflinePreviewActiveCard> serializer() {
            return a.f68887a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c implements InterfaceC8453a {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68889k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f68890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f68896g;
        public final boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Type f68897i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68898j;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68900b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68899a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard.Item", (GeneratedSerializer) obj, 10);
                pluginGeneratedSerialDescriptor.addElement("oid", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("date", true);
                pluginGeneratedSerialDescriptor.addElement("address", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("mask_img", true);
                pluginGeneratedSerialDescriptor.addElement("action_status", true);
                pluginGeneratedSerialDescriptor.addElement("action_type", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f68900b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f68889k;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, C8595a.f127260a, lazyArr[8].getValue(), lazyArr[9].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                boolean zBooleanValue;
                Map map;
                String strDecodeStringElement;
                long jDecodeLongElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                int i7;
                String strDecodeStringElement4;
                Type type;
                String strDecodeStringElement5;
                String strDecodeStringElement6;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68900b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68889k;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                    zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                    type = (Type) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), (Object) null);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), (Object) null);
                    i7 = 1023;
                } else {
                    boolean z6 = true;
                    zBooleanValue = false;
                    map = null;
                    strDecodeStringElement = null;
                    String strDecodeStringElement7 = null;
                    String strDecodeStringElement8 = null;
                    String strDecodeStringElement9 = null;
                    jDecodeLongElement = 0;
                    strDecodeStringElement2 = null;
                    strDecodeStringElement3 = null;
                    Type type2 = null;
                    i7 = 0;
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
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                break;
                            case 2:
                                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i7 |= 16;
                                break;
                            case 5:
                                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i7 |= 32;
                                break;
                            case 6:
                                strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                                i7 |= 64;
                                break;
                            case 7:
                                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                                i7 |= 128;
                                break;
                            case 8:
                                type2 = (Type) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), type2);
                                i7 |= 256;
                                break;
                            case 9:
                                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), map);
                                i7 |= 512;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    String str = strDecodeStringElement7;
                    strDecodeStringElement4 = strDecodeStringElement9;
                    type = type2;
                    strDecodeStringElement5 = strDecodeStringElement8;
                    strDecodeStringElement6 = str;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i7, jDecodeLongElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement, strDecodeStringElement6, strDecodeStringElement5, strDecodeStringElement4, zBooleanValue, type, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68900b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68900b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || cVar.f68890a != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, cVar.f68890a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(cVar.f68891b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, cVar.f68891b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(cVar.f68892c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, cVar.f68892c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(cVar.f68893d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, cVar.f68893d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(cVar.f68894e, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, cVar.f68894e);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || !Intrinsics.areEqual(cVar.f68895f, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, cVar.f68895f);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(cVar.f68896g, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, cVar.f68896g);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || cVar.h) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, C8595a.f127260a, Boolean.valueOf(cVar.h));
                }
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68889k;
                if (zShouldEncodeElementDefault || cVar.f68897i != Type.RESERVATION) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), cVar.f68897i);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(cVar.f68898j, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), cVar.f68898j);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return a.f68899a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68889k = new Lazy[]{null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new FJ.a(6)), LazyKt.lazy(lazyThreadSafetyMode, new DS0.b(5))};
        }

        public c() {
            Type type = Type.RESERVATION;
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            this.f68890a = 0L;
            this.f68891b = "";
            this.f68892c = "";
            this.f68893d = "";
            this.f68894e = "";
            this.f68895f = "";
            this.f68896g = "";
            this.h = false;
            this.f68897i = type;
            this.f68898j = mapEmptyMap;
        }

        public c(int i7, long j7, String str, String str2, String str3, String str4, String str5, String str6, boolean z6, Type type, Map map) {
            this.f68890a = (i7 & 1) == 0 ? 0L : j7;
            if ((i7 & 2) == 0) {
                this.f68891b = "";
            } else {
                this.f68891b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68892c = "";
            } else {
                this.f68892c = str2;
            }
            if ((i7 & 8) == 0) {
                this.f68893d = "";
            } else {
                this.f68893d = str3;
            }
            if ((i7 & 16) == 0) {
                this.f68894e = "";
            } else {
                this.f68894e = str4;
            }
            if ((i7 & 32) == 0) {
                this.f68895f = "";
            } else {
                this.f68895f = str5;
            }
            if ((i7 & 64) == 0) {
                this.f68896g = "";
            } else {
                this.f68896g = str6;
            }
            if ((i7 & 128) == 0) {
                this.h = false;
            } else {
                this.h = z6;
            }
            if ((i7 & 256) == 0) {
                this.f68897i = Type.RESERVATION;
            } else {
                this.f68897i = type;
            }
            if ((i7 & 512) == 0) {
                this.f68898j = MapsKt.emptyMap();
            } else {
                this.f68898j = map;
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
            return this.f68890a == cVar.f68890a && Intrinsics.areEqual(this.f68891b, cVar.f68891b) && Intrinsics.areEqual(this.f68892c, cVar.f68892c) && Intrinsics.areEqual(this.f68893d, cVar.f68893d) && Intrinsics.areEqual(this.f68894e, cVar.f68894e) && Intrinsics.areEqual(this.f68895f, cVar.f68895f) && Intrinsics.areEqual(this.f68896g, cVar.f68896g) && this.h == cVar.h && this.f68897i == cVar.f68897i && Intrinsics.areEqual(this.f68898j, cVar.f68898j);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68898j;
        }

        public final int hashCode() {
            int iA = z.a(E.a(E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f68890a) * 31, 31, this.f68891b), 31, this.f68892c), 31, this.f68893d), 31, this.f68894e), 31, this.f68895f), 31, this.f68896g), 31, this.h);
            return this.f68898j.hashCode() + ((this.f68897i.hashCode() + iA) * 31);
        }

        @NotNull
        public final String toString() {
            return "Item(oid=" + this.f68890a + ", title=" + this.f68891b + ", url=" + this.f68892c + ", date=" + this.f68893d + ", address=" + this.f68894e + ", cover=" + this.f68895f + ", maskImage=" + this.f68896g + ", inactive=" + this.h + ", type=" + this.f68897i + ", report=" + this.f68898j + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$d.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class d {

        @NotNull
        public static final b Companion = new b();

        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<c> f68901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.vippreview.a f68905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68907g;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$d$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68909b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard$d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68908a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard.ModuleData", (GeneratedSerializer) obj, 7);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("title_cover", true);
                pluginGeneratedSerialDescriptor.addElement("title_cover_night", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("tip", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("delivery_module_report", true);
                f68909b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = d.h;
                Object value = lazyArr[0].getValue();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{value, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(a.C0421a.f68917a), stringSerializer, lazyArr[6].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                Map map;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                com.bilibili.ogv.kmm.operation.vippreview.a aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68909b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.h;
                List list = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    aVar = (com.bilibili.ogv.kmm.operation.vippreview.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0421a.f68917a, (Object) null);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), (Object) null);
                    i7 = 127;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    map = null;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    strDecodeStringElement3 = null;
                    com.bilibili.ogv.kmm.operation.vippreview.a aVar2 = null;
                    String strDecodeStringElement5 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                                i7 |= 1;
                                break;
                            case 1:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                break;
                            case 2:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                aVar2 = (com.bilibili.ogv.kmm.operation.vippreview.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0421a.f68917a, aVar2);
                                i7 |= 16;
                                break;
                            case 5:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
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
                    com.bilibili.ogv.kmm.operation.vippreview.a aVar3 = aVar2;
                    strDecodeStringElement4 = strDecodeStringElement5;
                    aVar = aVar3;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i7, list, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, aVar, strDecodeStringElement4, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68909b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68909b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.h;
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), dVar.f68901a);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
                String str = dVar.f68902b;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
                }
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
                String str2 = dVar.f68903c;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str2, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, str2);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                String str3 = dVar.f68904d;
                if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(str3, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, str3);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                com.bilibili.ogv.kmm.operation.vippreview.a aVar = dVar.f68905e;
                if (zShouldEncodeElementDefault4 || aVar != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0421a.f68917a, aVar);
                }
                boolean zShouldEncodeElementDefault5 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                String str4 = dVar.f68906f;
                if (zShouldEncodeElementDefault5 || !Intrinsics.areEqual(str4, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, str4);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(dVar.f68907g, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), dVar.f68907g);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/VipOfflinePreviewActiveCard$d$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<d> serializer() {
                return a.f68908a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new K3.g(6)), null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new FJ.d(7))};
        }

        public d(int i7, List list, String str, String str2, String str3, com.bilibili.ogv.kmm.operation.vippreview.a aVar, String str4, Map map) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68909b);
            }
            this.f68901a = list;
            if ((i7 & 2) == 0) {
                this.f68902b = "";
            } else {
                this.f68902b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68903c = "";
            } else {
                this.f68903c = str2;
            }
            if ((i7 & 8) == 0) {
                this.f68904d = "";
            } else {
                this.f68904d = str3;
            }
            if ((i7 & 16) == 0) {
                this.f68905e = null;
            } else {
                this.f68905e = aVar;
            }
            if ((i7 & 32) == 0) {
                this.f68906f = "";
            } else {
                this.f68906f = str4;
            }
            if ((i7 & 64) == 0) {
                this.f68907g = MapsKt.emptyMap();
            } else {
                this.f68907g = map;
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
            return Intrinsics.areEqual(this.f68901a, dVar.f68901a) && Intrinsics.areEqual(this.f68902b, dVar.f68902b) && Intrinsics.areEqual(this.f68903c, dVar.f68903c) && Intrinsics.areEqual(this.f68904d, dVar.f68904d) && Intrinsics.areEqual(this.f68905e, dVar.f68905e) && Intrinsics.areEqual(this.f68906f, dVar.f68906f) && Intrinsics.areEqual(this.f68907g, dVar.f68907g);
        }

        public final int hashCode() {
            int iA = E.a(E.a(E.a(this.f68901a.hashCode() * 31, 31, this.f68902b), 31, this.f68903c), 31, this.f68904d);
            com.bilibili.ogv.kmm.operation.vippreview.a aVar = this.f68905e;
            return this.f68907g.hashCode() + E.a((iA + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f68906f);
        }

        @NotNull
        public final String toString() {
            List<c> list = this.f68901a;
            Map<String, String> map = this.f68907g;
            StringBuilder sbA = M.a("ModuleData(items=", ", title_cover=", list);
            sbA.append(this.f68902b);
            sbA.append(", title_cover_night=");
            sbA.append(this.f68903c);
            sbA.append(", url=");
            sbA.append(this.f68904d);
            sbA.append(", notice=");
            sbA.append(this.f68905e);
            sbA.append(", subtitle=");
            return C4665g.a(sbA, this.f68906f, ", delivery_module_report=", map, ")");
        }
    }

    public VipOfflinePreviewActiveCard(int i7, d dVar, String str, Map map, long j7, String str2) {
        if (25 != (i7 & 25)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 25, a.f68888b);
        }
        this.f68882a = dVar;
        if ((i7 & 2) == 0) {
            this.f68883b = "";
        } else {
            this.f68883b = str;
        }
        if ((i7 & 4) == 0) {
            this.f68884c = MapsKt.emptyMap();
        } else {
            this.f68884c = map;
        }
        this.f68885d = j7;
        this.f68886e = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipOfflinePreviewActiveCard)) {
            return false;
        }
        VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard = (VipOfflinePreviewActiveCard) obj;
        return Intrinsics.areEqual(this.f68882a, vipOfflinePreviewActiveCard.f68882a) && Intrinsics.areEqual(this.f68883b, vipOfflinePreviewActiveCard.f68883b) && Intrinsics.areEqual(this.f68884c, vipOfflinePreviewActiveCard.f68884c) && this.f68885d == vipOfflinePreviewActiveCard.f68885d && Intrinsics.areEqual(this.f68886e, vipOfflinePreviewActiveCard.f68886e);
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68885d;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68884c;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68886e;
    }

    public final int hashCode() {
        return this.f68886e.hashCode() + C3554n0.a(J2.g.a(E.a(this.f68882a.hashCode() * 31, 31, this.f68883b), this.f68884c, 31), 31, this.f68885d);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f68884c;
        StringBuilder sb = new StringBuilder("VipOfflinePreviewActiveCard(module_data=");
        sb.append(this.f68882a);
        sb.append(", title=");
        C7416u.a(sb, this.f68883b, ", report=", map, ", id=");
        sb.append(this.f68885d);
        sb.append(", type=");
        return C8770a.a(sb, this.f68886e, ")");
    }
}
