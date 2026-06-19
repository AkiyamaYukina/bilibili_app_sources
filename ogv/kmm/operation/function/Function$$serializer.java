package com.bilibili.ogv.kmm.operation.function;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.operation3.module.concept.ModuleTypeNames;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/Function$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class Function$$serializer implements GeneratedSerializer<Function> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Function$$serializer f68328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68329b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.function.Function$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68328a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.function.Function", (GeneratedSerializer) obj, 3);
        pluginGeneratedSerialDescriptor.addElement("module_data", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        final String[] strArr = {"FUNCTION_TEXT", "FUNCTION"};
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ModuleTypeNames(strArr) { // from class: com.bilibili.ogv.kmm.operation.function.Function$$serializer$annotationImpl$com_bilibili_ogv_operation3_module_concept_ModuleTypeNames$0
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
        f68329b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Function.f68324d[0].getValue(), LongSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        long jDecodeLongElement;
        int i7;
        String strDecodeStringElement;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68329b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = Function.f68324d;
        Yk0.c cVar = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            cVar = (Yk0.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            i7 = 7;
        } else {
            jDecodeLongElement = 0;
            boolean z6 = true;
            i7 = 0;
            strDecodeStringElement = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else if (iDecodeElementIndex == 0) {
                    cVar = (Yk0.c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), cVar);
                    i7 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                    i7 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i7 |= 4;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new Function(i7, cVar, jDecodeLongElement, strDecodeStringElement);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68329b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        Function function = (Function) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68329b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) Function.f68324d[0].getValue(), function.f68325a);
        compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, function.f68326b);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, function.f68327c);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
