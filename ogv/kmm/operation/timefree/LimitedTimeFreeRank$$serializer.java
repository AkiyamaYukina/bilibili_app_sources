package com.bilibili.ogv.kmm.operation.timefree;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
import java.util.Arrays;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/LimitedTimeFreeRank$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class LimitedTimeFreeRank$$serializer implements GeneratedSerializer<LimitedTimeFreeRank> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LimitedTimeFreeRank$$serializer f68864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68865b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68864a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank", (GeneratedSerializer) obj, 5);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("module_data", false);
        pluginGeneratedSerialDescriptor.addElement("report", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        final String[] strArr = {"RANK_CARD_B", "LIMIT_FREE_B"};
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ModuleTypeNames(strArr) { // from class: com.bilibili.ogv.kmm.operation.timefree.LimitedTimeFreeRank$$serializer$annotationImpl$com_bilibili_ogv_operation3_module_concept_ModuleTypeNames$0
            private final String[] names;

            {
                this.names = strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ModuleTypeNames.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(@Nullable Object obj2) {
                return (obj2 instanceof ModuleTypeNames) && Arrays.equals(names(), ((ModuleTypeNames) obj2).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(this.names) ^ 397397176;
            }

            @Override // com.bilibili.ogv.operation3.module.concept.ModuleTypeNames
            public final /* synthetic */ String[] names() {
                return this.names;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return android.support.v4.media.a.a("@com.bilibili.ogv.operation3.module.concept.ModuleTypeNames(names=", Arrays.toString(this.names), ")");
            }
        });
        f68865b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        Lazy<KSerializer<Object>>[] lazyArr = LimitedTimeFreeRank.f68858f;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, LimitedTimeFreeRank.b.a.f68876a, lazyArr[3].getValue(), LongSerializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        long jDecodeLongElement;
        int i7;
        String strDecodeStringElement;
        LimitedTimeFreeRank.b bVar;
        Map map;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68865b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = LimitedTimeFreeRank.f68858f;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            bVar = (LimitedTimeFreeRank.b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, LimitedTimeFreeRank.b.a.f68876a, (Object) null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
            i7 = 31;
        } else {
            jDecodeLongElement = 0;
            boolean z6 = true;
            i7 = 0;
            strDecodeStringElement = null;
            bVar = null;
            map = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i7 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i7 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    bVar = (LimitedTimeFreeRank.b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, LimitedTimeFreeRank.b.a.f68876a, bVar);
                    i7 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), map);
                    i7 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
                    i7 |= 16;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new LimitedTimeFreeRank(i7, strDecodeStringElement2, strDecodeStringElement, bVar, map, jDecodeLongElement);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68865b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        LimitedTimeFreeRank limitedTimeFreeRank = (LimitedTimeFreeRank) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68865b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, limitedTimeFreeRank.f68859a);
        boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1);
        String str = limitedTimeFreeRank.f68860b;
        if (zShouldEncodeElementDefault || !Intrinsics.areEqual(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, str);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, LimitedTimeFreeRank.b.a.f68876a, limitedTimeFreeRank.f68861c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(limitedTimeFreeRank.f68862d, MapsKt.emptyMap())) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) LimitedTimeFreeRank.f68858f[3].getValue(), limitedTimeFreeRank.f68862d);
        }
        compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 4, limitedTimeFreeRank.f68863e);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
