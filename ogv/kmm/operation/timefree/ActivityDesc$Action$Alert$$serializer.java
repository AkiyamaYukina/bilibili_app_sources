package com.bilibili.ogv.kmm.operation.timefree;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.timefree.ActivityDesc;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/ActivityDesc$Action$Alert$$serializer.class */
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
@StabilityInferred(parameters = 0)
public final /* synthetic */ class ActivityDesc$Action$Alert$$serializer implements GeneratedSerializer<ActivityDesc.Action.Alert> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ActivityDesc$Action$Alert$$serializer f68851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PluginGeneratedSerialDescriptor f68852b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.timefree.ActivityDesc$Action$Alert$$serializer, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
    static {
        ?? obj = new Object();
        f68851a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("alert", (GeneratedSerializer) obj, 1);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ActivityDesc$Action$Alert$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type"));
        f68852b = pluginGeneratedSerialDescriptor;
    }

    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final Object deserialize(Decoder decoder) throws UnknownFieldException {
        String strDecodeStringElement;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68852b;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i7 = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
        } else {
            strDecodeStringElement = null;
            boolean z6 = true;
            i7 = 0;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i7 = 1;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new ActivityDesc.Action.Alert(i7, strDecodeStringElement);
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68852b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68852b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, ((ActivityDesc.Action.Alert) obj).f68850b);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @NotNull
    public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
