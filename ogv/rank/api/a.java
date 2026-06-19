package com.bilibili.ogv.rank.api;

import I.E;
import K7.M;
import M3.C2624v;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.ogv.operation3.module.followable.i;
import com.bilibili.ogv.operation3.module.followable.l;
import com.bilibili.ogv.operation3.module.followable.m;
import com.bilibili.ogv.rank.api.b;
import com.bilibili.ogv.rank.api.g;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dl0.C6822c;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/a.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71907g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<c> f71908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f71912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RankThemeType f71913f;

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0451a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0451a f71914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71915b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.rank.api.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71914a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.rank.api.PartData", (GeneratedSerializer) obj, 6);
            pluginGeneratedSerialDescriptor.addElement("season_vo_list", true);
            pluginGeneratedSerialDescriptor.addElement("note", true);
            pluginGeneratedSerialDescriptor.addElement("top_title_url", true);
            pluginGeneratedSerialDescriptor.addElement("top_title", true);
            pluginGeneratedSerialDescriptor.addElement("top_cover_url", true);
            pluginGeneratedSerialDescriptor.addElement("color_control", true);
            f71915b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f71907g;
            Object value = lazyArr[0].getValue();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{value, stringSerializer, stringSerializer, stringSerializer, stringSerializer, lazyArr[5].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            RankThemeType rankThemeType;
            String strDecodeStringElement3;
            String strDecodeStringElement4;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71915b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71907g;
            List list = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                i7 = 63;
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                rankThemeType = (RankThemeType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), (Object) null);
            } else {
                boolean z6 = true;
                i7 = 0;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                String strDecodeStringElement5 = null;
                String strDecodeStringElement6 = null;
                rankThemeType = null;
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
                            strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                            break;
                        case 4:
                            strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                            i7 |= 16;
                            break;
                        case 5:
                            rankThemeType = (RankThemeType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), rankThemeType);
                            i7 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                String str = strDecodeStringElement5;
                strDecodeStringElement3 = strDecodeStringElement6;
                strDecodeStringElement4 = str;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, list, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement4, strDecodeStringElement3, rankThemeType);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71915b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71915b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71907g;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(aVar.f71908a, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), aVar.f71908a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(aVar.f71909b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, aVar.f71909b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(aVar.f71910c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, aVar.f71910c);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(aVar.f71911d, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, aVar.f71911d);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(aVar.f71912e, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, aVar.f71912e);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || aVar.f71913f != RankThemeType.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), aVar.f71913f);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0451a.f71914a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/a$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c implements InterfaceC7871a, InterfaceC8453a, l, i {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f71916u = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Ao0.e(7)), null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f71917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f71918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f71919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f71920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f71921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f71922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f71923g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f71924i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f71925j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f71926k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final g f71927l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.rank.api.b f71928m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final String f71929n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f71930o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final String f71931p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final String f71932q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f71933r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public final String f71934s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final String f71935t;

        /* JADX INFO: renamed from: com.bilibili.ogv.rank.api.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/a$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class C0452a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0452a f71936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f71937b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.rank.api.a$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f71936a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.rank.api.PartData.RankItem", (GeneratedSerializer) obj, 20);
                pluginGeneratedSerialDescriptor.addElement("oid", true);
                pluginGeneratedSerialDescriptor.addElement("season_id", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_RANK, true);
                pluginGeneratedSerialDescriptor.addElement("season_style", true);
                pluginGeneratedSerialDescriptor.addElement("season_tag", true);
                pluginGeneratedSerialDescriptor.addElement("names", true);
                pluginGeneratedSerialDescriptor.addElement("rating", true);
                pluginGeneratedSerialDescriptor.addElement("play_record", true);
                pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
                pluginGeneratedSerialDescriptor.addElement("upper", true);
                pluginGeneratedSerialDescriptor.addElement("icon_font", true);
                pluginGeneratedSerialDescriptor.addElement("type", true);
                pluginGeneratedSerialDescriptor.addElement("is_short_play", true);
                pluginGeneratedSerialDescriptor.addElement("subtitle", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                pluginGeneratedSerialDescriptor.addElement("clickEventId", true);
                pluginGeneratedSerialDescriptor.addElement("exposureEventId", true);
                f71937b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f71916u;
                LongSerializer longSerializer = LongSerializer.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{longSerializer, longSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, C8595a.f127260a, BuiltinSerializersKt.getNullable(g.a.f71956a), BuiltinSerializersKt.getNullable(b.a.f71939a), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, lazyArr[17].getValue(), stringSerializer, stringSerializer};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                String str;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                String strDecodeStringElement4;
                String strDecodeStringElement5;
                String strDecodeStringElement6;
                long jDecodeLongElement;
                long jDecodeLongElement2;
                int iDecodeIntElement;
                String strDecodeStringElement7;
                String strDecodeStringElement8;
                Map map;
                String strDecodeStringElement9;
                String strDecodeStringElement10;
                boolean zDecodeBooleanElement;
                com.bilibili.ogv.rank.api.b bVar;
                g gVar;
                boolean zBooleanValue;
                String strDecodeStringElement11;
                int i7;
                int i8;
                int i9;
                int i10;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71937b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f71916u;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                    strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                    zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                    gVar = (g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 11, g.a.f71956a, (Object) null);
                    bVar = (com.bilibili.ogv.rank.api.b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 12, b.a.f71939a, (Object) null);
                    str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 13, StringSerializer.INSTANCE, (Object) null);
                    zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 14);
                    strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 15);
                    strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 16);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), (Object) null);
                    strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 18);
                    strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 19);
                    i7 = 1048575;
                    iDecodeIntElement = iDecodeIntElement2;
                } else {
                    int i11 = 19;
                    boolean z6 = true;
                    str = null;
                    com.bilibili.ogv.rank.api.b bVar2 = null;
                    Map map2 = null;
                    strDecodeStringElement = null;
                    strDecodeStringElement2 = null;
                    strDecodeStringElement3 = null;
                    strDecodeStringElement4 = null;
                    strDecodeStringElement5 = null;
                    strDecodeStringElement6 = null;
                    String strDecodeStringElement12 = null;
                    String strDecodeStringElement13 = null;
                    String strDecodeStringElement14 = null;
                    String strDecodeStringElement15 = null;
                    String strDecodeStringElement16 = null;
                    int i12 = 0;
                    jDecodeLongElement = 0;
                    jDecodeLongElement2 = 0;
                    boolean zBooleanValue2 = false;
                    boolean zDecodeBooleanElement2 = false;
                    iDecodeIntElement = 0;
                    g gVar2 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                i11 = 19;
                                break;
                            case 0:
                                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                i12 |= 1;
                                i11 = 19;
                                break;
                            case 1:
                                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                                i12 |= 2;
                                i11 = 19;
                                break;
                            case 2:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i12 |= 4;
                                i11 = 19;
                                break;
                            case 3:
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i12 |= 8;
                                i11 = 19;
                                break;
                            case 4:
                                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                                i8 = i12;
                                i9 = 16;
                                i12 = i8 | i9;
                                i11 = 19;
                                break;
                            case 5:
                                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i8 = i12;
                                i9 = 32;
                                i12 = i8 | i9;
                                i11 = 19;
                                break;
                            case 6:
                                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                                i12 |= 64;
                                i11 = 19;
                                break;
                            case 7:
                                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                                i12 |= 128;
                                i11 = 19;
                                break;
                            case 8:
                                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                                i12 |= 256;
                                i11 = 19;
                                break;
                            case 9:
                                strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                                i12 |= 512;
                                i11 = 19;
                                break;
                            case 10:
                                zBooleanValue2 = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 10, C8595a.f127260a, Boolean.valueOf(zBooleanValue2))).booleanValue();
                                i12 |= 1024;
                                i11 = 19;
                                break;
                            case 11:
                                gVar2 = (g) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 11, g.a.f71956a, gVar2);
                                i12 |= 2048;
                                i11 = 19;
                                break;
                            case 12:
                                bVar2 = (com.bilibili.ogv.rank.api.b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 12, b.a.f71939a, bVar2);
                                i12 |= 4096;
                                i11 = 19;
                                break;
                            case 13:
                                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 13, StringSerializer.INSTANCE, str);
                                i12 |= 8192;
                                i11 = 19;
                                break;
                            case 14:
                                zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 14);
                                i12 |= 16384;
                                i11 = 19;
                                break;
                            case 15:
                                strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 15);
                                i10 = 32768;
                                i12 |= i10;
                                i11 = 19;
                                break;
                            case 16:
                                strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 16);
                                i10 = 65536;
                                i12 |= i10;
                                i11 = 19;
                                break;
                            case 17:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), map2);
                                i12 |= 131072;
                                i11 = 19;
                                break;
                            case 18:
                                strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 18);
                                i12 |= 262144;
                                break;
                            case 19:
                                strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i11);
                                i12 |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    boolean z7 = zBooleanValue2;
                    String str2 = strDecodeStringElement12;
                    String str3 = strDecodeStringElement13;
                    String str4 = strDecodeStringElement14;
                    strDecodeStringElement7 = strDecodeStringElement15;
                    strDecodeStringElement8 = strDecodeStringElement16;
                    map = map2;
                    strDecodeStringElement9 = str4;
                    strDecodeStringElement10 = str3;
                    zDecodeBooleanElement = zDecodeBooleanElement2;
                    bVar = bVar2;
                    gVar = gVar2;
                    zBooleanValue = z7;
                    strDecodeStringElement11 = str2;
                    i7 = i12;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(i7, jDecodeLongElement, jDecodeLongElement2, strDecodeStringElement, strDecodeStringElement2, iDecodeIntElement, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement11, zBooleanValue, gVar, bVar, str, zDecodeBooleanElement, strDecodeStringElement10, strDecodeStringElement9, map, strDecodeStringElement7, strDecodeStringElement8);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f71937b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71937b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = c.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || cVar.f71917a != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, cVar.f71917a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || cVar.f71918b != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, cVar.f71918b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(cVar.f71919c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, cVar.f71919c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(cVar.f71920d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, cVar.f71920d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || cVar.f71921e != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 4, cVar.f71921e);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || !Intrinsics.areEqual(cVar.f71922f, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, cVar.f71922f);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(cVar.f71923g, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, cVar.f71923g);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(cVar.h, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, cVar.h);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !Intrinsics.areEqual(cVar.f71924i, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, cVar.f71924i);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(cVar.f71925j, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, cVar.f71925j);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || cVar.f71926k) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 10, C8595a.f127260a, Boolean.valueOf(cVar.f71926k));
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 11) || cVar.f71927l != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 11, g.a.f71956a, cVar.f71927l);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 12) || cVar.f71928m != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 12, b.a.f71939a, cVar.f71928m);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 13) || !Intrinsics.areEqual(cVar.f71929n, "")) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 13, StringSerializer.INSTANCE, cVar.f71929n);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 14) || cVar.f71930o) {
                    compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 14, cVar.f71930o);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 15) || !Intrinsics.areEqual(cVar.f71931p, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 15, cVar.f71931p);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 16) || !Intrinsics.areEqual(cVar.f71932q, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 16, cVar.f71932q);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 17) || !Intrinsics.areEqual(cVar.f71933r, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 17, (SerializationStrategy) c.f71916u[17].getValue(), cVar.f71933r);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 18) || !Intrinsics.areEqual(cVar.f71934s, "pgc.{pageName}-ranklist.rank.works.click")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 18, cVar.f71934s);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 19) || !Intrinsics.areEqual(cVar.f71935t, "pgc.{pageName}-ranklist.rank.works.show")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 19, cVar.f71935t);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/api/a$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return C0452a.f71936a;
            }
        }

        public c() {
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            this.f71917a = 0L;
            this.f71918b = 0L;
            this.f71919c = "";
            this.f71920d = "";
            this.f71921e = 0;
            this.f71922f = "";
            this.f71923g = "";
            this.h = "";
            this.f71924i = "";
            this.f71925j = "";
            this.f71926k = false;
            this.f71927l = null;
            this.f71928m = null;
            this.f71929n = "";
            this.f71930o = false;
            this.f71931p = "";
            this.f71932q = "";
            this.f71933r = mapEmptyMap;
            this.f71934s = "pgc.{pageName}-ranklist.rank.works.click";
            this.f71935t = "pgc.{pageName}-ranklist.rank.works.show";
        }

        public c(int i7, long j7, long j8, String str, String str2, int i8, String str3, String str4, String str5, String str6, String str7, boolean z6, g gVar, com.bilibili.ogv.rank.api.b bVar, String str8, boolean z7, String str9, String str10, Map map, String str11, String str12) {
            if ((i7 & 1) == 0) {
                this.f71917a = 0L;
            } else {
                this.f71917a = j7;
            }
            if ((i7 & 2) == 0) {
                this.f71918b = 0L;
            } else {
                this.f71918b = j8;
            }
            if ((i7 & 4) == 0) {
                this.f71919c = "";
            } else {
                this.f71919c = str;
            }
            if ((i7 & 8) == 0) {
                this.f71920d = "";
            } else {
                this.f71920d = str2;
            }
            if ((i7 & 16) == 0) {
                this.f71921e = 0;
            } else {
                this.f71921e = i8;
            }
            if ((i7 & 32) == 0) {
                this.f71922f = "";
            } else {
                this.f71922f = str3;
            }
            if ((i7 & 64) == 0) {
                this.f71923g = "";
            } else {
                this.f71923g = str4;
            }
            if ((i7 & 128) == 0) {
                this.h = "";
            } else {
                this.h = str5;
            }
            if ((i7 & 256) == 0) {
                this.f71924i = "";
            } else {
                this.f71924i = str6;
            }
            if ((i7 & 512) == 0) {
                this.f71925j = "";
            } else {
                this.f71925j = str7;
            }
            if ((i7 & 1024) == 0) {
                this.f71926k = false;
            } else {
                this.f71926k = z6;
            }
            if ((i7 & 2048) == 0) {
                this.f71927l = null;
            } else {
                this.f71927l = gVar;
            }
            if ((i7 & 4096) == 0) {
                this.f71928m = null;
            } else {
                this.f71928m = bVar;
            }
            if ((i7 & 8192) == 0) {
                this.f71929n = "";
            } else {
                this.f71929n = str8;
            }
            if ((i7 & 16384) == 0) {
                this.f71930o = false;
            } else {
                this.f71930o = z7;
            }
            if ((32768 & i7) == 0) {
                this.f71931p = "";
            } else {
                this.f71931p = str9;
            }
            if ((65536 & i7) == 0) {
                this.f71932q = "";
            } else {
                this.f71932q = str10;
            }
            this.f71933r = (131072 & i7) == 0 ? MapsKt.emptyMap() : map;
            this.f71934s = (262144 & i7) == 0 ? "pgc.{pageName}-ranklist.rank.works.click" : str11;
            this.f71935t = (i7 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == 0 ? "pgc.{pageName}-ranklist.rank.works.show" : str12;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final long c() {
            return this.f71930o ? this.f71917a : this.f71918b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f71917a == cVar.f71917a && this.f71918b == cVar.f71918b && Intrinsics.areEqual(this.f71919c, cVar.f71919c) && Intrinsics.areEqual(this.f71920d, cVar.f71920d) && this.f71921e == cVar.f71921e && Intrinsics.areEqual(this.f71922f, cVar.f71922f) && Intrinsics.areEqual(this.f71923g, cVar.f71923g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f71924i, cVar.f71924i) && Intrinsics.areEqual(this.f71925j, cVar.f71925j) && this.f71926k == cVar.f71926k && Intrinsics.areEqual(this.f71927l, cVar.f71927l) && Intrinsics.areEqual(this.f71928m, cVar.f71928m) && Intrinsics.areEqual(this.f71929n, cVar.f71929n) && this.f71930o == cVar.f71930o && Intrinsics.areEqual(this.f71931p, cVar.f71931p) && Intrinsics.areEqual(this.f71932q, cVar.f71932q) && Intrinsics.areEqual(this.f71933r, cVar.f71933r);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String f() {
            return this.f71935t;
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final String getClickEventId() {
            return this.f71934s;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.i
        public final long getOid() {
            return this.f71917a;
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f71933r;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        @NotNull
        public final m getStatus() {
            return new C6822c(this.f71926k);
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f71932q;
        }

        public final int hashCode() {
            int iA = z.a(E.a(E.a(E.a(E.a(E.a(I.a(this.f71921e, E.a(E.a(C3554n0.a(Long.hashCode(this.f71917a) * 31, 31, this.f71918b), 31, this.f71919c), 31, this.f71920d), 31), 31, this.f71922f), 31, this.f71923g), 31, this.h), 31, this.f71924i), 31, this.f71925j), 31, this.f71926k);
            int iHashCode = 0;
            g gVar = this.f71927l;
            int iHashCode2 = gVar == null ? 0 : gVar.hashCode();
            com.bilibili.ogv.rank.api.b bVar = this.f71928m;
            int iHashCode3 = bVar == null ? 0 : bVar.f71938a.hashCode();
            String str = this.f71929n;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return this.f71933r.hashCode() + E.a(E.a(z.a((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.f71930o), 31, this.f71931p), 31, this.f71932q);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f71933r;
            StringBuilder sb = new StringBuilder("RankItem(oid=");
            sb.append(this.f71917a);
            sb.append(", seasonId=");
            sb.append(this.f71918b);
            sb.append(", title=");
            sb.append(this.f71919c);
            sb.append(", cover=");
            sb.append(this.f71920d);
            sb.append(", rank=");
            sb.append(this.f71921e);
            sb.append(", season_style=");
            sb.append(this.f71922f);
            sb.append(", season_tag=");
            sb.append(this.f71923g);
            sb.append(", names=");
            sb.append(this.h);
            sb.append(", rating=");
            sb.append(this.f71924i);
            sb.append(", play_record=");
            sb.append(this.f71925j);
            sb.append(", follow=");
            sb.append(this.f71926k);
            sb.append(", upper=");
            sb.append(this.f71927l);
            sb.append(", playInfo=");
            sb.append(this.f71928m);
            sb.append(", type=");
            sb.append(this.f71929n);
            sb.append(", is_short_play=");
            sb.append(this.f71930o);
            sb.append(", subtitle=");
            sb.append(this.f71931p);
            sb.append(", url=");
            return C4665g.a(sb, this.f71932q, ", report=", map, ")");
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71907g = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new J81.m(9)), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C2624v(5))};
    }

    public a() {
        List<c> listEmptyList = CollectionsKt.emptyList();
        RankThemeType rankThemeType = RankThemeType.UNKNOWN;
        this.f71908a = listEmptyList;
        this.f71909b = "";
        this.f71910c = "";
        this.f71911d = "";
        this.f71912e = "";
        this.f71913f = rankThemeType;
    }

    public a(int i7, List list, String str, String str2, String str3, String str4, RankThemeType rankThemeType) {
        this.f71908a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i7 & 2) == 0) {
            this.f71909b = "";
        } else {
            this.f71909b = str;
        }
        if ((i7 & 4) == 0) {
            this.f71910c = "";
        } else {
            this.f71910c = str2;
        }
        if ((i7 & 8) == 0) {
            this.f71911d = "";
        } else {
            this.f71911d = str3;
        }
        if ((i7 & 16) == 0) {
            this.f71912e = "";
        } else {
            this.f71912e = str4;
        }
        if ((i7 & 32) == 0) {
            this.f71913f = RankThemeType.UNKNOWN;
        } else {
            this.f71913f = rankThemeType;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f71908a, aVar.f71908a) && Intrinsics.areEqual(this.f71909b, aVar.f71909b) && Intrinsics.areEqual(this.f71910c, aVar.f71910c) && Intrinsics.areEqual(this.f71911d, aVar.f71911d) && Intrinsics.areEqual(this.f71912e, aVar.f71912e) && this.f71913f == aVar.f71913f;
    }

    public final int hashCode() {
        return this.f71913f.hashCode() + E.a(E.a(E.a(E.a(this.f71908a.hashCode() * 31, 31, this.f71909b), 31, this.f71910c), 31, this.f71911d), 31, this.f71912e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("PartData(modules=", ", note=", this.f71908a);
        sbA.append(this.f71909b);
        sbA.append(", top_title_url=");
        sbA.append(this.f71910c);
        sbA.append(", top_title=");
        sbA.append(this.f71911d);
        sbA.append(", top_cover_url=");
        sbA.append(this.f71912e);
        sbA.append(", color_control=");
        sbA.append(this.f71913f);
        sbA.append(")");
        return sbA.toString();
    }
}
