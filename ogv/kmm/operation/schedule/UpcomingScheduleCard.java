package com.bilibili.ogv.kmm.operation.schedule;

import H3.r0;
import H3.s0;
import K7.M;
import Yj0.a;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.e;
import com.bilibili.ogv.kmm.operation.api.k;
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
import kotlin.jvm.JvmStatic;
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
import kotlinx.serialization.json.JsonClassDiscriminator;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.StringResource;
import ql0.InterfaceC8453a;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard.class */
@SerialName("MIX_TIMELINE")
@StabilityInferred(parameters = 0)
@Serializable
public final class UpcomingScheduleCard implements InterfaceC5118d, InterfaceC7871a, InterfaceC8453a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68729c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new A91.b(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f68730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68731b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule.class */
    @JsonClassDiscriminator(discriminator = "item_type")
    @StabilityInferred(parameters = 0)
    @Serializable
    public static abstract class SubModule implements InterfaceC8453a {

        @NotNull
        public static final a Companion = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final Lazy<KSerializer<Object>> f68733f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68737d;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$Schedule.class */
        @SerialName("timeline")
        @StabilityInferred(parameters = 0)
        @Serializable
        public static final class Schedule extends SubModule {

            @NotNull
            public static final a Companion = new a();

            @JvmField
            @NotNull
            public static final Lazy<KSerializer<Object>>[] h;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            public final List<e> f68738g;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$Schedule$a.class */
            public static final class a {
                @NotNull
                public final KSerializer<Schedule> serializer() {
                    return UpcomingScheduleCard$SubModule$Schedule$$serializer.f68739a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                h = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new r0(5)), LazyKt.lazy(lazyThreadSafetyMode, new s0(5))};
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Schedule() {
                super(0);
                List<e> listEmptyList = CollectionsKt.emptyList();
                this.f68738g = listEmptyList;
            }

            public Schedule(int i7, String str, String str2, String str3, List list, Map map) {
                super(i7, str, str2, str3, map);
                if ((i7 & 16) == 0) {
                    this.f68738g = CollectionsKt.emptyList();
                } else {
                    this.f68738g = list;
                }
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Schedule) && Intrinsics.areEqual(this.f68738g, ((Schedule) obj).f68738g);
            }

            public final int hashCode() {
                return this.f68738g.hashCode();
            }

            @NotNull
            public final String toString() {
                return com.bapis.bilibili.account.interfaces.v1.k.a("Schedule(sub_items=", ")", this.f68738g);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$a.class */
        public static final class a {
            @NotNull
            public final KSerializer<SubModule> serializer() {
                return (KSerializer) SubModule.f68733f.getValue();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$b.class */
        @SerialName("comingsoon")
        @StabilityInferred(parameters = 0)
        @Serializable
        public static final class b extends SubModule {

            @NotNull
            public static final C0418b Companion = new C0418b();

            @JvmField
            @NotNull
            public static final Lazy<KSerializer<Object>>[] h;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            public final List<a.c> f68741g;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$b$a.class */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            @StabilityInferred(parameters = 0)
            public static final /* synthetic */ class a implements GeneratedSerializer<b> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f68742a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                @NotNull
                public static final PluginGeneratedSerialDescriptor f68743b;

                /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$SubModule$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
                static {
                    ?? obj = new Object();
                    f68742a = obj;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("comingsoon", (GeneratedSerializer) obj, 5);
                    pluginGeneratedSerialDescriptor.addElement("title", true);
                    pluginGeneratedSerialDescriptor.addElement("url", true);
                    pluginGeneratedSerialDescriptor.addElement("url_text", true);
                    pluginGeneratedSerialDescriptor.addElement("report", true);
                    pluginGeneratedSerialDescriptor.addElement("sub_items", true);
                    pluginGeneratedSerialDescriptor.pushClassAnnotation(new UpcomingScheduleCard$SubModule$Schedule$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("item_type"));
                    f68743b = pluginGeneratedSerialDescriptor;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @NotNull
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = b.h;
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, lazyArr[3].getValue(), lazyArr[4].getValue()};
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
                public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                    int i7;
                    String strDecodeStringElement;
                    String strDecodeStringElement2;
                    Map map;
                    List list;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68743b;
                    CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = b.h;
                    String strDecodeStringElement3 = null;
                    if (compositeDecoderBeginStructure.decodeSequentially()) {
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), (Object) null);
                        i7 = 31;
                    } else {
                        boolean z6 = true;
                        i7 = 0;
                        strDecodeStringElement = null;
                        strDecodeStringElement2 = null;
                        Map map2 = null;
                        List list2 = null;
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
                                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                            } else if (iDecodeElementIndex == 3) {
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), map2);
                                i7 |= 8;
                            } else {
                                if (iDecodeElementIndex != 4) {
                                    throw new UnknownFieldException(iDecodeElementIndex);
                                }
                                list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list2);
                                i7 |= 16;
                            }
                        }
                        List list3 = list2;
                        map = map2;
                        list = list3;
                    }
                    compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                    return new b(i7, strDecodeStringElement3, strDecodeStringElement, strDecodeStringElement2, list, map);
                }

                @NotNull
                public final SerialDescriptor getDescriptor() {
                    return f68743b;
                }

                public final void serialize(Encoder encoder, Object obj) {
                    b bVar = (b) obj;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68743b;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                    C0418b c0418b = b.Companion;
                    SubModule.a(bVar, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor);
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(bVar.f68741g, CollectionsKt.emptyList())) {
                        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) b.h[4].getValue(), bVar.f68741g);
                    }
                    compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                }

                @NotNull
                public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                    return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$SubModule$b$b, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$b$b.class */
            public static final class C0418b {
                @NotNull
                public final KSerializer<b> serializer() {
                    return a.f68742a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                h = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new AA0.a(8)), LazyKt.lazy(lazyThreadSafetyMode, new AA0.f(9))};
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b() {
                super(0);
                List<a.c> listEmptyList = CollectionsKt.emptyList();
                this.f68741g = listEmptyList;
            }

            public b(int i7, String str, String str2, String str3, List list, Map map) {
                super(i7, str, str2, str3, map);
                if ((i7 & 16) == 0) {
                    this.f68741g = CollectionsKt.emptyList();
                } else {
                    this.f68741g = list;
                }
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f68741g, ((b) obj).f68741g);
            }

            public final int hashCode() {
                return this.f68741g.hashCode();
            }

            @NotNull
            public final String toString() {
                return com.bapis.bilibili.account.interfaces.v1.k.a("Upcoming(sub_items=", ")", this.f68741g);
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68732e = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new A91.A(6))};
            f68733f = LazyKt.lazy(lazyThreadSafetyMode, new AA.a(7));
        }

        public SubModule() {
            throw null;
        }

        public SubModule(int i7) {
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            this.f68734a = "";
            this.f68735b = "";
            this.f68736c = "";
            this.f68737d = mapEmptyMap;
        }

        public /* synthetic */ SubModule(int i7, String str, String str2, String str3, Map map) {
            if ((i7 & 1) == 0) {
                this.f68734a = "";
            } else {
                this.f68734a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68735b = "";
            } else {
                this.f68735b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f68736c = "";
            } else {
                this.f68736c = str3;
            }
            if ((i7 & 8) == 0) {
                this.f68737d = MapsKt.emptyMap();
            } else {
                this.f68737d = map;
            }
        }

        @JvmStatic
        public static final void a(SubModule subModule, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(subModule.f68734a, "")) {
                compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 0, subModule.f68734a);
            }
            if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(subModule.f68735b, "")) {
                compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 1, subModule.f68735b);
            }
            if (compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(subModule.f68736c, "")) {
                compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 2, subModule.f68736c);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) && Intrinsics.areEqual(subModule.f68737d, MapsKt.emptyMap())) {
                return;
            }
            compositeEncoder.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) f68732e[3].getValue(), subModule.f68737d);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68737d;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<UpcomingScheduleCard> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68745b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68744a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MIX_TIMELINE", (GeneratedSerializer) obj, 2);
            pluginGeneratedSerialDescriptor.addElement("module_data", false);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            f68745b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{c.a.f68750a, UpcomingScheduleCard.f68729c[1].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            Map map;
            c cVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68745b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = UpcomingScheduleCard.f68729c;
            c cVar2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                cVar = (c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, c.a.f68750a, (Object) null);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                i7 = 3;
            } else {
                boolean z6 = true;
                i7 = 0;
                Map map2 = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        cVar2 = (c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, c.a.f68750a, cVar2);
                        i7 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map2);
                        i7 |= 2;
                    }
                }
                c cVar3 = cVar2;
                map = map2;
                cVar = cVar3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new UpcomingScheduleCard(i7, cVar, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68745b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            UpcomingScheduleCard upcomingScheduleCard = (UpcomingScheduleCard) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68745b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = UpcomingScheduleCard.Companion;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, c.a.f68750a, upcomingScheduleCard.f68730a);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(upcomingScheduleCard.f68731b, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) UpcomingScheduleCard.f68729c[1].getValue(), upcomingScheduleCard.f68731b);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<UpcomingScheduleCard> serializer() {
            return a.f68744a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$c.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class c {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68746d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<SubModule> f68747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.kmm.operation.api.j> f68749c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$c$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68751b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68750a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard.ModuleData", (GeneratedSerializer) obj, 3);
                pluginGeneratedSerialDescriptor.addElement("items", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("headers", true);
                f68751b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.f68746d;
                return new KSerializer[]{lazyArr[0].getValue(), StringSerializer.INSTANCE, lazyArr[2].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                List list;
                String strDecodeStringElement;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68751b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68746d;
                List list2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                    i7 = 7;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    String strDecodeStringElement2 = null;
                    List list3 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list3);
                            i7 |= 4;
                        }
                    }
                    String str = strDecodeStringElement2;
                    list = list3;
                    strDecodeStringElement = str;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new c(list2, list, strDecodeStringElement, i7);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68751b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68751b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = c.Companion;
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
                Lazy<KSerializer<Object>>[] lazyArr = c.f68746d;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(cVar.f68747a, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), cVar.f68747a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(cVar.f68748b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, cVar.f68748b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(cVar.f68749c, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), cVar.f68749c);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$c$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<c> serializer() {
                return a.f68750a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f68746d = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new A91.e(6)), null, LazyKt.lazy(lazyThreadSafetyMode, new A91.i(10))};
        }

        public c() {
            List<SubModule> listEmptyList = CollectionsKt.emptyList();
            List<com.bilibili.ogv.kmm.operation.api.j> listEmptyList2 = CollectionsKt.emptyList();
            this.f68747a = listEmptyList;
            this.f68748b = "";
            this.f68749c = listEmptyList2;
        }

        public c(List list, List list2, String str, int i7) {
            this.f68747a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i7 & 2) == 0) {
                this.f68748b = "";
            } else {
                this.f68748b = str;
            }
            if ((i7 & 4) == 0) {
                this.f68749c = CollectionsKt.emptyList();
            } else {
                this.f68749c = list2;
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
            return Intrinsics.areEqual(this.f68747a, cVar.f68747a) && Intrinsics.areEqual(this.f68748b, cVar.f68748b) && Intrinsics.areEqual(this.f68749c, cVar.f68749c);
        }

        public final int hashCode() {
            return this.f68749c.hashCode() + I.E.a(this.f68747a.hashCode() * 31, 31, this.f68748b);
        }

        @NotNull
        public final String toString() {
            List<SubModule> list = this.f68747a;
            List<com.bilibili.ogv.kmm.operation.api.j> list2 = this.f68749c;
            return N1.o.a(this.f68748b, ", headers=", ")", M.a("ModuleData(items=", ", url=", list), list2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$d.class */
    @StabilityInferred(parameters = 1)
    @Serializable
    public static final class d {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f68753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StringResource f68754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f68756e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$d$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68758b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68757a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard.ScheduleInfo", (GeneratedSerializer) obj, 5);
                pluginGeneratedSerialDescriptor.addElement("date", true);
                pluginGeneratedSerialDescriptor.addElement("date_ts", true);
                pluginGeneratedSerialDescriptor.addElement("day_of_week", true);
                pluginGeneratedSerialDescriptor.addElement("day_update_text", true);
                pluginGeneratedSerialDescriptor.addElement("is_today", true);
                f68758b = pluginGeneratedSerialDescriptor;
            }

            @NotNull
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{kSerializer, LongSerializer.INSTANCE, x.f68838a, kSerializer, C8595a.f127260a};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                boolean zBooleanValue;
                long jDecodeLongElement;
                int i7;
                String str;
                StringResource stringResource;
                String strDecodeStringElement;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68758b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                    stringResource = (StringResource) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, x.f68838a, (Object) null);
                    String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                    i7 = 31;
                    str = strDecodeStringElement2;
                } else {
                    boolean z6 = true;
                    zBooleanValue = false;
                    String strDecodeStringElement3 = null;
                    jDecodeLongElement = 0;
                    String strDecodeStringElement4 = null;
                    StringResource stringResource2 = null;
                    i7 = 0;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                        } else if (iDecodeElementIndex == 2) {
                            stringResource2 = (StringResource) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, x.f68838a, stringResource2);
                            i7 |= 4;
                        } else if (iDecodeElementIndex == 3) {
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                        } else {
                            if (iDecodeElementIndex != 4) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                            i7 |= 16;
                        }
                    }
                    str = strDecodeStringElement3;
                    stringResource = stringResource2;
                    strDecodeStringElement = strDecodeStringElement4;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new d(i7, strDecodeStringElement, jDecodeLongElement, stringResource, str, zBooleanValue);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68758b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68758b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = d.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(dVar.f68752a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, dVar.f68752a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || dVar.f68753b != 0) {
                    compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, dVar.f68753b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(dVar.f68754c, (StringResource) O3.a.f17690C.getValue())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, x.f68838a, dVar.f68754c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(dVar.f68755d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, dVar.f68755d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || dVar.f68756e) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, C8595a.f127260a, Boolean.valueOf(dVar.f68756e));
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$d$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<d> serializer() {
                return a.f68757a;
            }
        }

        public d() {
            StringResource stringResource = (StringResource) O3.a.f17690C.getValue();
            this.f68752a = "";
            this.f68753b = 0L;
            this.f68754c = stringResource;
            this.f68755d = "";
            this.f68756e = false;
        }

        public d(int i7, String str, long j7, StringResource stringResource, String str2, boolean z6) {
            if ((i7 & 1) == 0) {
                this.f68752a = "";
            } else {
                this.f68752a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68753b = 0L;
            } else {
                this.f68753b = j7;
            }
            if ((i7 & 4) == 0) {
                this.f68754c = (StringResource) O3.a.f17690C.getValue();
            } else {
                this.f68754c = stringResource;
            }
            if ((i7 & 8) == 0) {
                this.f68755d = "";
            } else {
                this.f68755d = str2;
            }
            if ((i7 & 16) == 0) {
                this.f68756e = false;
            } else {
                this.f68756e = z6;
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
            return Intrinsics.areEqual(this.f68752a, dVar.f68752a) && this.f68753b == dVar.f68753b && Intrinsics.areEqual(this.f68754c, dVar.f68754c) && Intrinsics.areEqual(this.f68755d, dVar.f68755d) && this.f68756e == dVar.f68756e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68756e) + I.E.a((this.f68754c.hashCode() + C3554n0.a(this.f68752a.hashCode() * 31, 31, this.f68753b)) * 31, 31, this.f68755d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ScheduleInfo(date=");
            sb.append(this.f68752a);
            sb.append(", date_ts=");
            sb.append(this.f68753b);
            sb.append(", day_of_week=");
            sb.append(this.f68754c);
            sb.append(", day_update_text=");
            sb.append(this.f68755d);
            sb.append(", is_today=");
            return androidx.appcompat.app.i.a(sb, this.f68756e, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$e.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class e {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68759c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new A91.j(7))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final d f68760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<f> f68761b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$e$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68762a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68763b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$e$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68762a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard.ScheduleItem", (GeneratedSerializer) obj, 2);
                pluginGeneratedSerialDescriptor.addElement("timeline", false);
                pluginGeneratedSerialDescriptor.addElement("sub_items", true);
                f68763b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{d.a.f68757a, e.f68759c[1].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                List list;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68763b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e.f68759c;
                d dVar = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68757a, (Object) null);
                    list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                    i7 = 3;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    list = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            dVar = (d) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68757a, dVar);
                            i7 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list);
                            i7 |= 2;
                        }
                    }
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new e(i7, dVar, list);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68763b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68763b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = e.Companion;
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, d.a.f68757a, eVar.f68760a);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(eVar.f68761b, CollectionsKt.emptyList())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) e.f68759c[1].getValue(), eVar.f68761b);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$e$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<e> serializer() {
                return a.f68762a;
            }
        }

        public e(int i7, d dVar, List list) {
            if (1 != (i7 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68763b);
            }
            this.f68760a = dVar;
            if ((i7 & 2) == 0) {
                this.f68761b = CollectionsKt.emptyList();
            } else {
                this.f68761b = list;
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
            return Intrinsics.areEqual(this.f68760a, eVar.f68760a) && Intrinsics.areEqual(this.f68761b, eVar.f68761b);
        }

        public final int hashCode() {
            return this.f68761b.hashCode() + (this.f68760a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ScheduleItem(timeline=" + this.f68760a + ", sub_items=" + this.f68761b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$f.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class f implements InterfaceC7871a, InterfaceC8453a, com.bilibili.ogv.operation3.module.followable.l {

        @NotNull
        public static final b Companion = new b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68764j = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new A91.y(7)), null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f68767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f68768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f68769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ogv.kmm.operation.api.k f68770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68771g;
        public final long h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.kmm.operation.api.e f68772i;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$f$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68773a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68774b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard$f$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68773a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.schedule.UpcomingScheduleCard.ScheduleSubItem", (GeneratedSerializer) obj, 9);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("cover", true);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("pub_time", true);
                pluginGeneratedSerialDescriptor.addElement("pub_index", true);
                pluginGeneratedSerialDescriptor.addElement("new_ep", false);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                pluginGeneratedSerialDescriptor.addElement("season_id", false);
                pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
                f68774b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = f.f68764j;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(k.a.f68010a), lazyArr[6].getValue(), LongSerializer.INSTANCE, e.a.f67983a};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                long jDecodeLongElement;
                int i7;
                String strDecodeStringElement;
                com.bilibili.ogv.kmm.operation.api.e eVar;
                Map map;
                com.bilibili.ogv.kmm.operation.api.k kVar;
                String str;
                String strDecodeStringElement2;
                String strDecodeStringElement3;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68774b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = f.f68764j;
                String strDecodeStringElement4 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                    kVar = (com.bilibili.ogv.kmm.operation.api.k) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, k.a.f68010a, (Object) null);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), (Object) null);
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 7);
                    eVar = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, e.a.f67983a, (Object) null);
                    i7 = 511;
                    str = strDecodeStringElement5;
                } else {
                    jDecodeLongElement = 0;
                    boolean z6 = true;
                    i7 = 0;
                    com.bilibili.ogv.kmm.operation.api.e eVar2 = null;
                    Map map2 = null;
                    com.bilibili.ogv.kmm.operation.api.k kVar2 = null;
                    strDecodeStringElement = null;
                    String strDecodeStringElement6 = null;
                    String strDecodeStringElement7 = null;
                    String strDecodeStringElement8 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        switch (iDecodeElementIndex) {
                            case -1:
                                z6 = false;
                                break;
                            case 0:
                                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                                i7 |= 1;
                                break;
                            case 1:
                                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                i7 |= 2;
                                break;
                            case 2:
                                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                                i7 |= 4;
                                break;
                            case 3:
                                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                                i7 |= 8;
                                break;
                            case 4:
                                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                                i7 |= 16;
                                break;
                            case 5:
                                kVar2 = (com.bilibili.ogv.kmm.operation.api.k) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, k.a.f68010a, kVar2);
                                i7 |= 32;
                                break;
                            case 6:
                                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), map2);
                                i7 |= 64;
                                break;
                            case 7:
                                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 7);
                                i7 |= 128;
                                break;
                            case 8:
                                eVar2 = (com.bilibili.ogv.kmm.operation.api.e) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 8, e.a.f67983a, eVar2);
                                i7 |= 256;
                                break;
                            default:
                                throw new UnknownFieldException(iDecodeElementIndex);
                        }
                    }
                    String str2 = strDecodeStringElement7;
                    String str3 = strDecodeStringElement8;
                    eVar = eVar2;
                    map = map2;
                    kVar = kVar2;
                    str = str3;
                    strDecodeStringElement2 = str2;
                    strDecodeStringElement3 = strDecodeStringElement6;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new f(i7, strDecodeStringElement4, strDecodeStringElement, strDecodeStringElement3, strDecodeStringElement2, str, kVar, map, jDecodeLongElement, eVar);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68774b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                f fVar = (f) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68774b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                b bVar = f.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(fVar.f68765a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, fVar.f68765a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(fVar.f68766b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, fVar.f68766b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(fVar.f68767c, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, fVar.f68767c);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(fVar.f68768d, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, fVar.f68768d);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(fVar.f68769e, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, fVar.f68769e);
                }
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, k.a.f68010a, fVar.f68770f);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(fVar.f68771g, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (SerializationStrategy) f.f68764j[6].getValue(), fVar.f68771g);
                }
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 7, fVar.h);
                boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8);
                com.bilibili.ogv.kmm.operation.api.e eVar = fVar.f68772i;
                if (zShouldEncodeElementDefault || !Intrinsics.areEqual(eVar, new com.bilibili.ogv.kmm.operation.api.e(0))) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 8, e.a.f67983a, eVar);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$f$b.class */
        public static final class b {
            @NotNull
            public final KSerializer<f> serializer() {
                return a.f68773a;
            }
        }

        public f(int i7, String str, String str2, String str3, String str4, String str5, com.bilibili.ogv.kmm.operation.api.k kVar, Map map, long j7, com.bilibili.ogv.kmm.operation.api.e eVar) {
            if (160 != (i7 & 160)) {
                PluginExceptionsKt.throwMissingFieldException(i7, 160, a.f68774b);
            }
            if ((i7 & 1) == 0) {
                this.f68765a = "";
            } else {
                this.f68765a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68766b = "";
            } else {
                this.f68766b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f68767c = "";
            } else {
                this.f68767c = str3;
            }
            if ((i7 & 8) == 0) {
                this.f68768d = "";
            } else {
                this.f68768d = str4;
            }
            if ((i7 & 16) == 0) {
                this.f68769e = "";
            } else {
                this.f68769e = str5;
            }
            this.f68770f = kVar;
            if ((i7 & 64) == 0) {
                this.f68771g = MapsKt.emptyMap();
            } else {
                this.f68771g = map;
            }
            this.h = j7;
            if ((i7 & 256) == 0) {
                this.f68772i = new com.bilibili.ogv.kmm.operation.api.e(0);
            } else {
                this.f68772i = eVar;
            }
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final long c() {
            return this.h;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f68765a, fVar.f68765a) && Intrinsics.areEqual(this.f68766b, fVar.f68766b) && Intrinsics.areEqual(this.f68767c, fVar.f68767c) && Intrinsics.areEqual(this.f68768d, fVar.f68768d) && Intrinsics.areEqual(this.f68769e, fVar.f68769e) && Intrinsics.areEqual(this.f68770f, fVar.f68770f) && Intrinsics.areEqual(this.f68771g, fVar.f68771g) && this.h == fVar.h && Intrinsics.areEqual(this.f68772i, fVar.f68772i);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68771g;
        }

        @Override // com.bilibili.ogv.operation3.module.followable.l
        public final com.bilibili.ogv.operation3.module.followable.m getStatus() {
            return this.f68772i;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f68765a;
        }

        public final int hashCode() {
            int iA = I.E.a(I.E.a(I.E.a(I.E.a(this.f68765a.hashCode() * 31, 31, this.f68766b), 31, this.f68767c), 31, this.f68768d), 31, this.f68769e);
            com.bilibili.ogv.kmm.operation.api.k kVar = this.f68770f;
            return Boolean.hashCode(this.f68772i.f67982a) + C3554n0.a(J2.g.a((iA + (kVar == null ? 0 : kVar.f68009a.hashCode())) * 31, this.f68771g, 31), 31, this.h);
        }

        @NotNull
        public final String toString() {
            return "ScheduleSubItem(url=" + this.f68765a + ", cover=" + this.f68766b + ", title=" + this.f68767c + ", pub_time=" + this.f68768d + ", pub_index=" + this.f68769e + ", new_ep=" + this.f68770f + ", report=" + this.f68771g + ", season_id=" + this.h + ", status=" + this.f68772i + ")";
        }
    }

    public UpcomingScheduleCard(int i7, c cVar, Map map) {
        if (1 != (i7 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f68745b);
        }
        this.f68730a = cVar;
        if ((i7 & 2) == 0) {
            this.f68731b = MapsKt.emptyMap();
        } else {
            this.f68731b = map;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingScheduleCard)) {
            return false;
        }
        UpcomingScheduleCard upcomingScheduleCard = (UpcomingScheduleCard) obj;
        return Intrinsics.areEqual(this.f68730a, upcomingScheduleCard.f68730a) && Intrinsics.areEqual(this.f68731b, upcomingScheduleCard.f68731b);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68731b;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f68730a.f68748b;
    }

    public final int hashCode() {
        return this.f68731b.hashCode() + (this.f68730a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "UpcomingScheduleCard(module_data=" + this.f68730a + ", report=" + this.f68731b + ")";
    }
}
