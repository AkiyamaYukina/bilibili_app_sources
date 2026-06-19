package com.bilibili.studio.videoeditor.media.performance;

import Di0.C1600d;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyConfigV1.class */
@Keep
public class BeautifyConfigV1 {
    public static final float INVALID_VALUE = -999.0f;

    @JSONField(name = "back_camera")
    public CameraConfig backCamera;

    @JSONField(name = "front_camera")
    public CameraConfig frontCamera;

    @JSONField(name = "template_list")
    public List<TemplateConfig> templates;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyConfigV1$BeautifyParams.class */
    @Keep
    public static class BeautifyParams {

        @JSONField(name = "filter_average_skin_color")
        public float filterAverageSkinColor = -999.0f;

        @JSONField(name = "smooth_strength")
        public float smoothStrength = -999.0f;

        @JSONField(name = "sharpen")
        public float sharpen = -999.0f;

        @JSONField(name = "whitening")
        public float whitening = -999.0f;

        @JSONField(name = "filter_style_adjustment")
        public float filterStyleAdjustment = -999.0f;

        @JSONField(name = "redden")
        public float redden = -999.0f;

        @JSONField(name = "remove_nasolabial_folds")
        public float removeNasolabialFolds = -999.0f;

        @JSONField(name = "remove_dark_circle")
        public float removeDarkCircle = -999.0f;

        @JSONField(name = "bright_eye")
        public float brightEye = -999.0f;

        @JSONField(name = "eye_distance")
        public float eyeDistance = -999.0f;

        @JSONField(name = "eye_enlarging")
        public float eyeEnlarging = -999.0f;

        @JSONField(name = "filter_eyes_vertical_move")
        public float filterEyesVerticalMove = -999.0f;

        @JSONField(name = "filter_eyebrow")
        public float filterEyebrow = -999.0f;

        @JSONField(name = "round_eye")
        public float roundEye = -999.0f;

        @JSONField(name = "open_canthus")
        public float openCanthus = -999.0f;

        @JSONField(name = "outer_canthus")
        public float outerCanthus = -999.0f;

        @JSONField(name = "eye_angle")
        public float eyeAngle = -999.0f;

        @JSONField(name = "apple_muscle")
        public float appleMuscle = -999.0f;

        @JSONField(name = "hairline")
        public float hairline = -999.0f;

        @JSONField(name = "thin_face")
        public float thinFace = -999.0f;

        @JSONField(name = "shrink_jaw")
        public float shrinkJaw = -999.0f;

        @JSONField(name = "narrow_face")
        public float narrowFace = -999.0f;

        @JSONField(name = "shrink_cheekbone")
        public float shrinkCheekbone = -999.0f;

        @JSONField(name = "shrink_under_jaw")
        public float shrinkUnderJaw = -999.0f;

        @JSONField(name = "chin_length")
        public float chinLength = -999.0f;

        @JSONField(name = "sharp_chin")
        public float sharpChin = -999.0f;

        @JSONField(name = "filter_bridge_of_nose")
        public float filterBridgeOfNose = -999.0f;

        @JSONField(name = "profile_rhinoplasty")
        public float profileRhinoplasty = -999.0f;

        @JSONField(name = "narrow_nose")
        public float narrowNose = -999.0f;

        @JSONField(name = "filter_root_of_nose")
        public float filterRootOfNose = -999.0f;

        @JSONField(name = "wing_of_nose")
        public float wingOfNose = -999.0f;

        @JSONField(name = "long_nose")
        public float longNose = -999.0f;

        @JSONField(name = "mouth_size")
        public float mouthSize = -999.0f;

        @JSONField(name = "lip")
        public float lip = -999.0f;

        @JSONField(name = "philtrum")
        public float philtrum = -999.0f;

        @JSONField(name = "white_teeth")
        public float whiteTeeth = -999.0f;
        private final ArrayMap<String, Float> paramsMap = new ArrayMap<>();

        public Float getBeautifyValue(String str) {
            return this.paramsMap.get(str) == null ? Float.valueOf(0.0f) : this.paramsMap.get(str);
        }

        public ArrayMap<String, Float> getParamsMap() {
            return this.paramsMap;
        }

        public void mapParams() {
            this.paramsMap.clear();
            this.paramsMap.put("Strength", Float.valueOf(this.smoothStrength));
            this.paramsMap.put("Whitening", Float.valueOf(this.whitening));
            this.paramsMap.put("Shrink Face", Float.valueOf(this.thinFace));
            this.paramsMap.put("Eye Enlarging", Float.valueOf(this.eyeEnlarging));
            this.paramsMap.put("Hairline Height Param", Float.valueOf(this.hairline));
            this.paramsMap.put("Chin Length Param", Float.valueOf(this.chinLength));
            this.paramsMap.put("Narrow Nose Param", Float.valueOf(this.narrowNose));
            this.paramsMap.put("narrow face", Float.valueOf(this.narrowFace));
            this.paramsMap.put("Mouth Size Param", Float.valueOf(this.mouthSize));
            this.paramsMap.put("Bright Eye Param", Float.valueOf(this.brightEye));
            this.paramsMap.put("White Teeth Param", Float.valueOf(this.whiteTeeth));
            this.paramsMap.put("shrink jaw", Float.valueOf(this.shrinkJaw));
            this.paramsMap.put("long nose", Float.valueOf(this.longNose));
            this.paramsMap.put("remove dark circles", Float.valueOf(this.removeDarkCircle));
            this.paramsMap.put("remove nasolabial folds", Float.valueOf(this.removeNasolabialFolds));
            this.paramsMap.put("shrink cheekbone", Float.valueOf(this.shrinkCheekbone));
            this.paramsMap.put("sharpen", Float.valueOf(this.sharpen));
            this.paramsMap.put("shrink under jaw", Float.valueOf(this.shrinkUnderJaw));
            this.paramsMap.put("sharp chin", Float.valueOf(this.sharpChin));
            this.paramsMap.put("wing of nose", Float.valueOf(this.wingOfNose));
            this.paramsMap.put("lip", Float.valueOf(this.lip));
            this.paramsMap.put("Reddening", Float.valueOf(this.redden));
            this.paramsMap.put("round eye", Float.valueOf(this.roundEye));
            this.paramsMap.put("bridge of nose", Float.valueOf(this.filterBridgeOfNose));
            this.paramsMap.put("apple muscle", Float.valueOf(this.appleMuscle));
            this.paramsMap.put("profile rhinoplasty", Float.valueOf(this.profileRhinoplasty));
            this.paramsMap.put("philtrum", Float.valueOf(this.philtrum));
            this.paramsMap.put("eye distance", Float.valueOf(this.eyeDistance));
            this.paramsMap.put("eye angle", Float.valueOf(this.eyeAngle));
            this.paramsMap.put("open canthus", Float.valueOf(this.openCanthus));
            this.paramsMap.put("average skin color", Float.valueOf(this.filterAverageSkinColor));
            this.paramsMap.put("eyes vertical move", Float.valueOf(this.filterEyesVerticalMove));
            this.paramsMap.put("eyebrow", Float.valueOf(this.filterEyebrow));
            this.paramsMap.put("root of nose", Float.valueOf(this.filterRootOfNose));
            this.paramsMap.put("outer canthus", Float.valueOf(this.outerCanthus));
            this.paramsMap.put("style adjustment", Float.valueOf(this.filterStyleAdjustment));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BeautifyParams{filterAverageSkinColor=");
            sb.append(this.filterAverageSkinColor);
            sb.append(", smoothStrength=");
            sb.append(this.smoothStrength);
            sb.append(", sharpen=");
            sb.append(this.sharpen);
            sb.append(", whitening=");
            sb.append(this.whitening);
            sb.append(", filterStyleAdjustment=");
            sb.append(this.filterStyleAdjustment);
            sb.append(", redden=");
            sb.append(this.redden);
            sb.append(", removeNasolabialFolds=");
            sb.append(this.removeNasolabialFolds);
            sb.append(", removeDarkCircle=");
            sb.append(this.removeDarkCircle);
            sb.append(", brightEye=");
            sb.append(this.brightEye);
            sb.append(", eyeDistance=");
            sb.append(this.eyeDistance);
            sb.append(", eyeEnlarging=");
            sb.append(this.eyeEnlarging);
            sb.append(", filterEyesVerticalMove=");
            sb.append(this.filterEyesVerticalMove);
            sb.append(", filterEyebrow=");
            sb.append(this.filterEyebrow);
            sb.append(", roundEye=");
            sb.append(this.roundEye);
            sb.append(", openCanthus=");
            sb.append(this.openCanthus);
            sb.append(", outerCanthus=");
            sb.append(this.outerCanthus);
            sb.append(", eyeAngle=");
            sb.append(this.eyeAngle);
            sb.append(", appleMuscle=");
            sb.append(this.appleMuscle);
            sb.append(", hairline=");
            sb.append(this.hairline);
            sb.append(", thinFace=");
            sb.append(this.thinFace);
            sb.append(", shrinkJaw=");
            sb.append(this.shrinkJaw);
            sb.append(", narrowFace=");
            sb.append(this.narrowFace);
            sb.append(", shrinkCheekbone=");
            sb.append(this.shrinkCheekbone);
            sb.append(", shrinkUnderJaw=");
            sb.append(this.shrinkUnderJaw);
            sb.append(", chinLength=");
            sb.append(this.chinLength);
            sb.append(", sharpChin=");
            sb.append(this.sharpChin);
            sb.append(", filterBridgeOfNose=");
            sb.append(this.filterBridgeOfNose);
            sb.append(", profileRhinoplasty=");
            sb.append(this.profileRhinoplasty);
            sb.append(", narrowNose=");
            sb.append(this.narrowNose);
            sb.append(", filterRootOfNose=");
            sb.append(this.filterRootOfNose);
            sb.append(", wingOfNose=");
            sb.append(this.wingOfNose);
            sb.append(", longNose=");
            sb.append(this.longNose);
            sb.append(", mouthSize=");
            sb.append(this.mouthSize);
            sb.append(", lip=");
            sb.append(this.lip);
            sb.append(", philtrum=");
            sb.append(this.philtrum);
            sb.append(", whiteTeeth=");
            return C1600d.a(sb, this.whiteTeeth, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyConfigV1$CameraConfig.class */
    @Keep
    public static class CameraConfig {

        @JSONField(name = EditCustomizeSticker.TAG_TEMPLATE_ID)
        public int templateId;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyConfigV1$GradeConfig.class */
    @Keep
    public static class GradeConfig {
        public BeautifyParams config;
        public int grade;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/media/performance/BeautifyConfigV1$TemplateConfig.class */
    @Keep
    public static class TemplateConfig {

        @JSONField(name = "list")
        public List<GradeConfig> gradeConfigs;
        public int id;
        public String name;
    }
}
