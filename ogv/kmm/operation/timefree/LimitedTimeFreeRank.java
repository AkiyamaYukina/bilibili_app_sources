package com.bilibili.ogv.kmm.operation.timefree;

import G3.P0;
import G3.Q0;
import G3.R0;
import G3.S0;
import I.E;
import J2.g;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.d;
import com.bilibili.ogv.kmm.operation.api.j;
import com.bilibili.ogv.kmm.operation.timefree.ActivityDesc;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
import h6.C7416u;
import h6.C7417v;
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
import kotlin.time.Duration;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/LimitedTimeFreeRank.class */
@StabilityInferred(parameters = 0)
@ModuleTypeNames(names = {"RANK_CARD_B", "LIMIT_FREE_B"})
@Serializable
public final class LimitedTimeFreeRank implements InterfaceC5118d, InterfaceC8453a, InterfaceC7871a, d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68858f = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new P0(8)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f68861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68863e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/LimitedTimeFreeRank$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<LimitedTimeFreeRank> serializer() {
            return LimitedTimeFreeRank$$serializer.f68864a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/LimitedTimeFreeRank$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class b {

        @NotNull
        public static final C0420b Companion = new C0420b();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68866k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<j> f68867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.operation3.module.operablecard.a> f68868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f68872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f68873g;

        @NotNull
        public final Map<String, String> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final ActivityDesc f68874i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f68875j;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/LimitedTimeFreeRank$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68877b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68876a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank.ModuleData", (GeneratedSerializer) obj, 10);
                pluginGeneratedSerialDescriptor.addElement("headers", true);
                pluginGeneratedSerialDescriptor.addElement("items", false);
                pluginGeneratedSerialDescriptor.addElement("bg_img", true);
                pluginGeneratedSerialDescriptor.addElement("title_cover_night", true);
                pluginGeneratedSerialDescriptor.addElement("title_cover", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("sub_title", true);
                pluginGeneratedSerialDescriptor.addElement("delivery_module_report", true);
                pluginGeneratedSerialDescriptor.addElement("activity_description", true);
                pluginGeneratedSerialDescriptor.addElement("remaining_time", true);
                f68877b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = b.f68866k;
                Object value = lazyArr[0].getValue();
                Object value2 = lazyArr[1].getValue();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{value, value2, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, lazyArr[7].getValue(), BuiltinSerializersKt.getNullable(ActivityDesc.a.f68856a), sj0.d.f127269a};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                String strDecodeStringElement;
                String strDecodeStringElement2;
                String str;
                Duration duration;
                ActivityDesc activityDesc;
                Map map;
                String str2;
                String strDecodeStringElement3;
                List list;
                List list2;
                int i8;
                int i9;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68877b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.f68866k;
                int i10 = 8;
                List list3 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                    String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                    Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), (Object) null);
                    ActivityDesc activityDesc2 = (ActivityDesc) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, ActivityDesc.a.f68856a, (Object) null);
                    duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, sj0.d.f127269a, (Object) null);
                    i7 = 1023;
                    str2 = strDecodeStringElement4;
                    str = strDecodeStringElement5;
                    map = map2;
                    activityDesc = activityDesc2;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    Duration duration2 = null;
                    ActivityDesc activityDesc3 = null;
                    Map map3 = null;
                    List list4 = null;
                    strDecodeStringElement = null;
                    String strDecodeStringElement6 = null;
                    String strDecodeStringElement7 = null;
                    String strDecodeStringElement8 = null;
                    String strDecodeStringElement9 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                continue;
                            case 0:
                                list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                                i8 = i7;
                                i9 = 1;
                                break;
                            case 1:
                                list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list4);
                                i8 = i7;
                                i9 = 2;
                                break;
                            case 2:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                i10 = 8;
                                continue;
                            case 3:
                                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                continue;
                            case 4:
                                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i7 |= 16;
                                continue;
                            case 5:
                                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 5);
                                i7 |= 32;
                                continue;
                            case 6:
                                strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                                i7 |= 64;
                                continue;
                            case 7:
                                map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), map3);
                                i7 |= 128;
                                continue;
                            case 8:
                                activityDesc3 = (ActivityDesc) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i10, ActivityDesc.a.f68856a, activityDesc3);
                                i7 |= 256;
                                continue;
                            case 9:
                                duration2 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 9, sj0.d.f127269a, duration2);
                                i7 |= 512;
                                continue;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        i7 = i8 | i9;
                        i10 = 8;
                    }
                    String str3 = strDecodeStringElement6;
                    String str4 = strDecodeStringElement7;
                    strDecodeStringElement2 = strDecodeStringElement8;
                    str = strDecodeStringElement9;
                    duration = duration2;
                    activityDesc = activityDesc3;
                    map = map3;
                    str2 = str4;
                    strDecodeStringElement3 = str3;
                    list = list4;
                    list2 = list3;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i7, list2, list, strDecodeStringElement, strDecodeStringElement3, str2, strDecodeStringElement2, str, map, activityDesc, duration);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68877b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68877b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                C0420b c0420b = b.Companion;
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
                Lazy<KSerializer<Object>>[] lazyArr = b.f68866k;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(bVar.f68867a, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), bVar.f68867a);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), bVar.f68868b);
                boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
                String str = bVar.f68869c;
                if (zShouldEncodeElementDefault2 || !Intrinsics.areEqual(str, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, str);
                }
                boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                String str2 = bVar.f68870d;
                if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(str2, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, str2);
                }
                boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                String str3 = bVar.f68871e;
                if (zShouldEncodeElementDefault4 || !Intrinsics.areEqual(str3, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, str3);
                }
                boolean zShouldEncodeElementDefault5 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                String str4 = bVar.f68872f;
                if (zShouldEncodeElementDefault5 || !Intrinsics.areEqual(str4, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 5, str4);
                }
                boolean zShouldEncodeElementDefault6 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6);
                String str5 = bVar.f68873g;
                if (zShouldEncodeElementDefault6 || !Intrinsics.areEqual(str5, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, str5);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(bVar.h, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), bVar.h);
                }
                boolean zShouldEncodeElementDefault7 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
                ActivityDesc activityDesc = bVar.f68874i;
                if (zShouldEncodeElementDefault7 || activityDesc != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 8, ActivityDesc.a.f68856a, activityDesc);
                }
                boolean zShouldEncodeElementDefault8 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9);
                long j7 = bVar.f68875j;
                if (zShouldEncodeElementDefault8 || !Duration.equals-impl0(j7, Duration.Companion.getZERO-UwyO8pc())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 9, sj0.d.f127269a, Duration.box-impl(j7));
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/LimitedTimeFreeRank$b$b.class */
        public static final class C0420b {
            @NotNull
            public final KSerializer<b> serializer() {
                return a.f68876a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68866k = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Q0(11)), LazyKt.lazy(lazyThreadSafetyMode, new R0(11)), null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new S0(9)), null, null};
        }

        public b(int i7, List list, List list2, String str, String str2, String str3, String str4, String str5, Map map, ActivityDesc activityDesc, Duration duration) {
            if (2 != (i7 & 2)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 2, a.f68877b);
            }
            this.f68867a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
            this.f68868b = list2;
            if ((i7 & 4) == 0) {
                this.f68869c = "";
            } else {
                this.f68869c = str;
            }
            if ((i7 & 8) == 0) {
                this.f68870d = "";
            } else {
                this.f68870d = str2;
            }
            if ((i7 & 16) == 0) {
                this.f68871e = "";
            } else {
                this.f68871e = str3;
            }
            if ((i7 & 32) == 0) {
                this.f68872f = "";
            } else {
                this.f68872f = str4;
            }
            if ((i7 & 64) == 0) {
                this.f68873g = "";
            } else {
                this.f68873g = str5;
            }
            if ((i7 & 128) == 0) {
                this.h = MapsKt.emptyMap();
            } else {
                this.h = map;
            }
            if ((i7 & 256) == 0) {
                this.f68874i = null;
            } else {
                this.f68874i = activityDesc;
            }
            this.f68875j = (i7 & 512) == 0 ? Duration.Companion.getZERO-UwyO8pc() : duration.unbox-impl();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f68867a, bVar.f68867a) && Intrinsics.areEqual(this.f68868b, bVar.f68868b) && Intrinsics.areEqual(this.f68869c, bVar.f68869c) && Intrinsics.areEqual(this.f68870d, bVar.f68870d) && Intrinsics.areEqual(this.f68871e, bVar.f68871e) && Intrinsics.areEqual(this.f68872f, bVar.f68872f) && Intrinsics.areEqual(this.f68873g, bVar.f68873g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.f68874i, bVar.f68874i) && Duration.equals-impl0(this.f68875j, bVar.f68875j);
        }

        public final int hashCode() {
            int iA = g.a(E.a(E.a(E.a(E.a(E.a(e0.a(this.f68867a.hashCode() * 31, 31, this.f68868b), 31, this.f68869c), 31, this.f68870d), 31, this.f68871e), 31, this.f68872f), 31, this.f68873g), this.h, 31);
            ActivityDesc activityDesc = this.f68874i;
            return Duration.hashCode-impl(this.f68875j) + ((iA + (activityDesc == null ? 0 : activityDesc.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            List<j> list = this.f68867a;
            List<com.bilibili.ogv.operation3.module.operablecard.a> list2 = this.f68868b;
            Map<String, String> map = this.h;
            String str = Duration.toString-impl(this.f68875j);
            StringBuilder sbA = C7417v.a("ModuleData(headers=", ", items=", ", bgImg=", list, list2);
            sbA.append(this.f68869c);
            sbA.append(", title_cover_night=");
            sbA.append(this.f68870d);
            sbA.append(", title_cover=");
            sbA.append(this.f68871e);
            sbA.append(", url=");
            sbA.append(this.f68872f);
            sbA.append(", subtitle=");
            C7416u.a(sbA, this.f68873g, ", delivery_module_report=", map, ", activity_description=");
            sbA.append(this.f68874i);
            sbA.append(", remaining_time=");
            sbA.append(str);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public LimitedTimeFreeRank(int i7, String str, String str2, b bVar, Map map, long j7) {
        if (21 != (i7 & 21)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 21, LimitedTimeFreeRank$$serializer.f68865b);
        }
        this.f68859a = str;
        if ((i7 & 2) == 0) {
            this.f68860b = "";
        } else {
            this.f68860b = str2;
        }
        this.f68861c = bVar;
        if ((i7 & 8) == 0) {
            this.f68862d = MapsKt.emptyMap();
        } else {
            this.f68862d = map;
        }
        this.f68863e = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitedTimeFreeRank)) {
            return false;
        }
        LimitedTimeFreeRank limitedTimeFreeRank = (LimitedTimeFreeRank) obj;
        return Intrinsics.areEqual(this.f68859a, limitedTimeFreeRank.f68859a) && Intrinsics.areEqual(this.f68860b, limitedTimeFreeRank.f68860b) && Intrinsics.areEqual(this.f68861c, limitedTimeFreeRank.f68861c) && Intrinsics.areEqual(this.f68862d, limitedTimeFreeRank.f68862d) && this.f68863e == limitedTimeFreeRank.f68863e;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68863e;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68862d;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68859a;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68861c.f68872f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68863e) + g.a((this.f68861c.hashCode() + E.a(this.f68859a.hashCode() * 31, 31, this.f68860b)) * 31, this.f68862d, 31);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f68862d;
        StringBuilder sb = new StringBuilder("LimitedTimeFreeRank(type=");
        sb.append(this.f68859a);
        sb.append(", title=");
        sb.append(this.f68860b);
        sb.append(", module_data=");
        sb.append(this.f68861c);
        sb.append(", report=");
        sb.append(map);
        sb.append(", id=");
        return android.support.v4.media.session.a.a(sb, this.f68863e, ")");
    }
}
