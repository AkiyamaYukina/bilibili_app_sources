package com.bilibili.ogv.secondary.part;

import G3.C1946s;
import X1.C3081k;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/v.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class v {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f72897d = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C1946s(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f72899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<w> f72900c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/v$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f72901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f72902b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.secondary.part.v$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f72901a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.secondary.part.FallRegionContent", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("cbottom", true);
            pluginGeneratedSerialDescriptor.addElement("ctop", true);
            pluginGeneratedSerialDescriptor.addElement("new", true);
            f72902b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = v.f72897d;
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            return new KSerializer[]{longSerializer, longSerializer, lazyArr[2].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            long jDecodeLongElement;
            long jDecodeLongElement2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72902b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = v.f72897d;
            List list = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), (Object) null);
                i7 = 7;
            } else {
                long jDecodeLongElement3 = 0;
                boolean z6 = true;
                i7 = 0;
                long jDecodeLongElement4 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list);
                        i7 |= 4;
                    }
                }
                jDecodeLongElement = jDecodeLongElement4;
                jDecodeLongElement2 = jDecodeLongElement3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new v(list, jDecodeLongElement, jDecodeLongElement2, i7);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f72902b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            v vVar = (v) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72902b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = v.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || vVar.f72898a != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, vVar.f72898a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || vVar.f72899b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, vVar.f72899b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(vVar.f72900c, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) v.f72897d[2].getValue(), vVar.f72900c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/v$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<v> serializer() {
            return a.f72901a;
        }
    }

    public v() {
        List<w> listEmptyList = CollectionsKt.emptyList();
        this.f72898a = 0L;
        this.f72899b = 0L;
        this.f72900c = listEmptyList;
    }

    public v(List list, long j7, long j8, int i7) {
        if ((i7 & 1) == 0) {
            this.f72898a = 0L;
        } else {
            this.f72898a = j7;
        }
        if ((i7 & 2) == 0) {
            this.f72899b = 0L;
        } else {
            this.f72899b = j8;
        }
        this.f72900c = (i7 & 4) == 0 ? CollectionsKt.emptyList() : list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f72898a == vVar.f72898a && this.f72899b == vVar.f72899b && Intrinsics.areEqual(this.f72900c, vVar.f72900c);
    }

    public final int hashCode() {
        return this.f72900c.hashCode() + C3554n0.a(Long.hashCode(this.f72898a) * 31, 31, this.f72899b);
    }

    @NotNull
    public final String toString() {
        List<w> list = this.f72900c;
        StringBuilder sb = new StringBuilder("FallRegionContent(cbottom=");
        sb.append(this.f72898a);
        sb.append(", ctop=");
        C3081k.c(sb, this.f72899b, ", ugcItem=", list);
        sb.append(")");
        return sb.toString();
    }
}
