package com.bilibili.ogv.kmm.operation.filmlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.filmlist.CardCollection;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/CardCollection$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class CardCollection$$serializer implements GeneratedSerializer<CardCollection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CardCollection$$serializer f68282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68283b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.filmlist.CardCollection$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68282a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.filmlist.CardCollection", (GeneratedSerializer) obj, 5);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("module_data", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("report", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        final String[] strArr = {"FOLLOW_C", "FOLLOW_V", "RANK_CARD", "COMMON_PLAYLIST"};
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ModuleTypeNames(strArr) { // from class: com.bilibili.ogv.kmm.operation.filmlist.CardCollection$$serializer$annotationImpl$com_bilibili_ogv_operation3_module_concept_ModuleTypeNames$0
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
        f68283b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        Lazy<KSerializer<Object>>[] lazyArr = CardCollection.f68276f;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, CardCollection.b.a.f68291a, stringSerializer, lazyArr[3].getValue(), LongSerializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        long jDecodeLongElement;
        int i7;
        CardCollection.b bVar;
        String strDecodeStringElement;
        Map map;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68283b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = CardCollection.f68276f;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            bVar = (CardCollection.b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, CardCollection.b.a.f68291a, (Object) null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
            i7 = 31;
        } else {
            jDecodeLongElement = 0;
            boolean z6 = true;
            i7 = 0;
            bVar = null;
            strDecodeStringElement = null;
            map = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i7 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    bVar = (CardCollection.b) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, CardCollection.b.a.f68291a, bVar);
                    i7 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
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
        return new CardCollection(i7, strDecodeStringElement2, bVar, strDecodeStringElement, map, jDecodeLongElement);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68283b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        CardCollection cardCollection = (CardCollection) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68283b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, cardCollection.f68277a);
        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, CardCollection.b.a.f68291a, cardCollection.f68278b);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, cardCollection.f68279c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(cardCollection.f68280d, MapsKt.emptyMap())) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) CardCollection.f68276f[3].getValue(), cardCollection.f68280d);
        }
        compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 4, cardCollection.f68281e);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
