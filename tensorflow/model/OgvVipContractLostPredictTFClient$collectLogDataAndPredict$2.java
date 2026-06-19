package com.bilibili.tensorflow.model;

import G0.g;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.tensorflow.data.api.TfRemoteDataService;
import com.bilibili.tflite.TFLite;
import com.google.gson.JsonObject;
import java.nio.MappedByteBuffer;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.tensorflow.lite.Interpreter;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2.class */
final class OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final int $orderType;
    int label;

    /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f110772a;

        /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1$1.class */
        public static final class C12141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final int $orderType;
            final MappedByteBuffer $tfByteBuffer;
            final List<Integer> $vipRemoteDataList;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12141(List<Integer> list, MappedByteBuffer mappedByteBuffer, int i7, Continuation<? super C12141> continuation) {
                super(2, continuation);
                this.$vipRemoteDataList = list;
                this.$tfByteBuffer = mappedByteBuffer;
                this.$orderType = i7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0() {
                return true;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12141(this.$vipRemoteDataList, this.$tfByteBuffer, this.$orderType, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
            public final Object invokeSuspend(Object obj) {
                byte b7;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                } catch (Exception e7) {
                    com.bilibili.biligame.dialogdispatcher.e.a("[tensorflow-OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1$1-invokeSuspend] ", e7.getMessage(), "OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1$1-invokeSuspend", e7);
                }
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvVipContractLostPredictTFClient ogvVipContractLostPredictTFClient = OgvVipContractLostPredictTFClient.f110768a;
                    List<Integer> list = this.$vipRemoteDataList;
                    try {
                        Interpreter interpreter = new Interpreter(this.$tfByteBuffer);
                        OgvVipContractLostPredictTFClient.f110770c = list;
                        int size = list.size();
                        float[] fArr = new float[size];
                        for (int i8 = 0; i8 < size; i8++) {
                            fArr[i8] = new float[1];
                        }
                        float[][] fArr2 = new float[1][];
                        fArr2[0] = fArr;
                        int i9 = 0;
                        for (T t7 : list) {
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            fArr2[0][i9][0] = ((Number) t7).intValue();
                            i9++;
                        }
                        float[] fArr3 = new float[1];
                        fArr3[0] = new float[1];
                        interpreter.run(fArr2, fArr3);
                        interpreter.close();
                        b7 = fArr3[0][0];
                    } catch (Exception e8) {
                        com.bilibili.biligame.dialogdispatcher.e.a("[tensorflow-OgvVipContractLostPredictTFClient-predict] ", e8.getMessage(), "OgvVipContractLostPredictTFClient-predict", e8);
                        b7 = -1082130432;
                    }
                    if ((b7 == true ? 1.0f : 0.0f) > 0.0f) {
                        OgvVipContractLostPredictTFClient ogvVipContractLostPredictTFClient2 = OgvVipContractLostPredictTFClient.f110768a;
                        BLog.i("OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1$1-invokeSuspend", "[tensorflow-OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2$1$1-invokeSuspend] " + g.a(b7 == true ? 1.0f : 0.0f, "predictVipResult"));
                        Neurons.trackT$default(false, "ogv.contract_lose.predict", MapsKt.hashMapOf(new Pair[]{TuplesKt.to(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(b7 == true ? 1.0f : 0.0f)), TuplesKt.to("steps", OgvVipContractLostPredictTFClient.f110770c.toString()), TuplesKt.to("mod_version", d.f110782e), TuplesKt.to("native_version", "1")}), 0, (Function0) new Object(), 8, (Object) null);
                        Neurons.report$default(false, 0, "vip.user_save.forecast.other", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("probability_forecast", String.valueOf(b7 == true ? 1.0f : 0.0f)), TuplesKt.to("model_version", d.f110782e), TuplesKt.to("order_type", String.valueOf(this.$orderType))}), (String) null, 0, 48, (Object) null);
                        TfRemoteDataService tfRemoteDataService = com.bilibili.tensorflow.data.api.a.f110717b;
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("vip-cancel-model", Boxing.boxFloat(b7 == true ? 1.0f : 0.0f));
                        String json = JsonUtilKt.toJson(jsonObject);
                        this.label = 1;
                        if (tfRemoteDataService.updateVipLossProbability(json, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OgvVipContractLostPredictTFClient.f110771d = true;
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(int i7) {
            this.f110772a = i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0190 A[Catch: Exception -> 0x0068, TRY_ENTER, TryCatch #0 {Exception -> 0x0068, blocks: (B:20:0x0060, B:26:0x0087, B:57:0x0184, B:59:0x0190, B:62:0x0196, B:28:0x0097, B:52:0x014c, B:31:0x00a7, B:45:0x0106, B:47:0x010c, B:66:0x01d3, B:67:0x01de, B:32:0x00af, B:39:0x00dd, B:41:0x00f8, B:35:0x00c7), top: B:72:0x0044 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Boolean r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                Method dump skipped, instruction units count: 495
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.model.OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2.AnonymousClass1.emit(java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2(int i7, Continuation<? super OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2> continuation) {
        super(2, continuation);
        this.$orderType = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVipContractLostPredictTFClient$collectLogDataAndPredict$2(this.$orderType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Boolean> tfSoStateReadyFlow = TFLite.INSTANCE.getTfSoStateReadyFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderType);
            this.label = 1;
            if (tfSoStateReadyFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
