package com.bilibili.ogv.kmm.operation.function;

import I.E;
import I3.C2199a1;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.d;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/Function.class */
@StabilityInferred(parameters = 0)
@ModuleTypeNames(names = {"FUNCTION_TEXT", "FUNCTION"})
@Serializable
public final class Function implements InterfaceC5118d, d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68324d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Eq.b(8)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yk0.c<List<b>> f68325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68327c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/Function$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<Function> serializer() {
            return Function$$serializer.f68328a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/Function$b.class */
    @StabilityInferred(parameters = 0)
    @Serializable
    public static final class b implements InterfaceC7871a, InterfaceC8453a {

        @NotNull
        public static final C0409b Companion = new C0409b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final Lazy<KSerializer<Object>>[] f68330d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C2199a1(7))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f68331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f68332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f68333c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/Function$b$a.class */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        @StabilityInferred(parameters = 0)
        public static final /* synthetic */ class a implements GeneratedSerializer<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f68334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final PluginGeneratedSerialDescriptor f68335b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.function.Function$b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
            static {
                ?? obj = new Object();
                f68334a = obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.function.Function.Item", (GeneratedSerializer) obj, 3);
                pluginGeneratedSerialDescriptor.addElement("title", true);
                pluginGeneratedSerialDescriptor.addElement("url", true);
                pluginGeneratedSerialDescriptor.addElement("report", true);
                f68335b = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = b.f68330d;
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new KSerializer[]{stringSerializer, stringSerializer, lazyArr[2].getValue()};
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
            public final Object deserialize(Decoder decoder) throws UnknownFieldException {
                int i7;
                Map map;
                String strDecodeStringElement;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68335b;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.f68330d;
                String strDecodeStringElement2 = null;
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                    i7 = 7;
                } else {
                    boolean z6 = true;
                    i7 = 0;
                    String strDecodeStringElement3 = null;
                    Map map2 = null;
                    while (z6) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z6 = false;
                        } else if (iDecodeElementIndex == 0) {
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                        } else if (iDecodeElementIndex == 1) {
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                        } else {
                            if (iDecodeElementIndex != 2) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map2);
                            i7 |= 4;
                        }
                    }
                    String str = strDecodeStringElement3;
                    map = map2;
                    strDecodeStringElement = str;
                }
                compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
                return new b(i7, strDecodeStringElement2, strDecodeStringElement, map);
            }

            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f68335b;
            }

            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68335b;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                C0409b c0409b = b.Companion;
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(bVar.f68331a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, bVar.f68331a);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(bVar.f68332b, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bVar.f68332b);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(bVar.f68333c, MapsKt.emptyMap())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) b.f68330d[2].getValue(), bVar.f68333c);
                }
                compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            }

            @NotNull
            public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.function.Function$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/Function$b$b.class */
        public static final class C0409b {
            @NotNull
            public final KSerializer<b> serializer() {
                return a.f68334a;
            }
        }

        public b() {
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            this.f68331a = "";
            this.f68332b = "";
            this.f68333c = mapEmptyMap;
        }

        public b(int i7, String str, String str2, Map map) {
            if ((i7 & 1) == 0) {
                this.f68331a = "";
            } else {
                this.f68331a = str;
            }
            if ((i7 & 2) == 0) {
                this.f68332b = "";
            } else {
                this.f68332b = str2;
            }
            if ((i7 & 4) == 0) {
                this.f68333c = MapsKt.emptyMap();
            } else {
                this.f68333c = map;
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
            return Intrinsics.areEqual(this.f68331a, bVar.f68331a) && Intrinsics.areEqual(this.f68332b, bVar.f68332b) && Intrinsics.areEqual(this.f68333c, bVar.f68333c);
        }

        @Override // ql0.InterfaceC8453a
        @NotNull
        public final Map<String, String> getReport() {
            return this.f68333c;
        }

        @Override // ll0.InterfaceC7871a
        @NotNull
        public final String getUrl() {
            return this.f68332b;
        }

        public final int hashCode() {
            return this.f68333c.hashCode() + E.a(this.f68331a.hashCode() * 31, 31, this.f68332b);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f68333c;
            StringBuilder sb = new StringBuilder("Item(title=");
            sb.append(this.f68331a);
            sb.append(", url=");
            return C4665g.a(sb, this.f68332b, ", report=", map, ")");
        }
    }

    public Function(int i7, Yk0.c cVar, long j7, String str) {
        if (7 != (i7 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 7, Function$$serializer.f68329b);
        }
        this.f68325a = cVar;
        this.f68326b = j7;
        this.f68327c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Function)) {
            return false;
        }
        Function function = (Function) obj;
        return Intrinsics.areEqual(this.f68325a, function.f68325a) && this.f68326b == function.f68326b && Intrinsics.areEqual(this.f68327c, function.f68327c);
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    public final long getId() {
        return this.f68326b;
    }

    @Override // com.bilibili.ogv.kmm.operation.api.d
    @NotNull
    public final String getType() {
        return this.f68327c;
    }

    public final int hashCode() {
        return this.f68327c.hashCode() + C3554n0.a(this.f68325a.hashCode() * 31, 31, this.f68326b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Function(module_data=");
        sb.append(this.f68325a);
        sb.append(", id=");
        sb.append(this.f68326b);
        sb.append(", type=");
        return C8770a.a(sb, this.f68327c, ")");
    }
}
