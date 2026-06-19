package com.bilibili.biligame.api.bean.gamedetail;

import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameSignActivityDetail_JsonDescriptor.class */
public final class GameSignActivityDetail_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public GameSignActivityDetail_JsonDescriptor() {
        super(GameSignActivityDetail.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("activity_desc", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("prop_pic_url", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("gift_usage", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("code_end_time", (String[]) null, String.class, (Class) null, 6);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("days_before_end", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("activity_end", (String[]) null, Boolean.TYPE, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor("description_tpl", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("game_info", (String[]) null, BiligameMainGame.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor9 = new PojoPropertyDescriptor("signGiftList", (String[]) null, Types.parameterizedType(List.class, new Type[]{SignTaskInfo.class}), (Class) null, 18);
        PojoPropertyDescriptor pojoPropertyDescriptor10 = new PojoPropertyDescriptor("activity_background_color", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor11 = new PojoPropertyDescriptor("activity_id", (String[]) null, String.class, (Class) null, 6);
        Class cls2 = Long.TYPE;
        return new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, pojoPropertyDescriptor9, pojoPropertyDescriptor10, pojoPropertyDescriptor11, new PojoPropertyDescriptor("start_time", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("end_time", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("activity_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("activity_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("game_base_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("max_sign_times", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("sign_task_info_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{SignTaskInfo.class}), (Class) null, 22), new PojoPropertyDescriptor("user_sign_info", (String[]) null, UserSignInfo.class, (Class) null, 6)};
    }

    public Object constructWith(Object[] objArr) {
        GameSignActivityDetail gameSignActivityDetail = new GameSignActivityDetail();
        Object obj = objArr[0];
        if (obj != null) {
            gameSignActivityDetail.setActivityDesc((String) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            gameSignActivityDetail.setPropPicUrl((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            gameSignActivityDetail.setGiftUsage((String) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            gameSignActivityDetail.setCodeEndTime((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            gameSignActivityDetail.setDaysBeforeEnd(((Integer) obj5).intValue());
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            gameSignActivityDetail.setActivityEnd(((Boolean) obj6).booleanValue());
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            gameSignActivityDetail.setDescription((String) obj7);
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            gameSignActivityDetail.setGameInfo((BiligameMainGame) obj8);
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            gameSignActivityDetail.setSignGiftList((List) obj9);
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            gameSignActivityDetail.setActivityBackgroundColor((String) obj10);
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            gameSignActivityDetail.setActivityId((String) obj11);
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            gameSignActivityDetail.setStartTime(((Long) obj12).longValue());
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            gameSignActivityDetail.setEndTime(((Long) obj13).longValue());
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            gameSignActivityDetail.setActivityType(((Integer) obj14).intValue());
        }
        Object obj15 = objArr[14];
        if (obj15 != null) {
            gameSignActivityDetail.setActivityStatus(((Integer) obj15).intValue());
        }
        Object obj16 = objArr[15];
        if (obj16 != null) {
            gameSignActivityDetail.setTitle((String) obj16);
        }
        Object obj17 = objArr[16];
        if (obj17 != null) {
            gameSignActivityDetail.setGameBaseId(((Integer) obj17).intValue());
        }
        Object obj18 = objArr[17];
        if (obj18 != null) {
            gameSignActivityDetail.setMaxSignTimes(((Integer) obj18).intValue());
        }
        Object obj19 = objArr[18];
        if (obj19 != null) {
            gameSignActivityDetail.setSignTaskInfoList((List) obj19);
        }
        Object obj20 = objArr[19];
        if (obj20 != null) {
            gameSignActivityDetail.setUserSignInfo((UserSignInfo) obj20);
        }
        return gameSignActivityDetail;
    }

    public Object get(Object obj, int i7) {
        GameSignActivityDetail gameSignActivityDetail = (GameSignActivityDetail) obj;
        switch (i7) {
            case 0:
                return gameSignActivityDetail.getActivityDesc();
            case 1:
                return gameSignActivityDetail.getPropPicUrl();
            case 2:
                return gameSignActivityDetail.getGiftUsage();
            case 3:
                return gameSignActivityDetail.getCodeEndTime();
            case 4:
                return Integer.valueOf(gameSignActivityDetail.getDaysBeforeEnd());
            case 5:
                return Boolean.valueOf(gameSignActivityDetail.getActivityEnd());
            case 6:
                return gameSignActivityDetail.getDescription();
            case 7:
                return gameSignActivityDetail.getGameInfo();
            case 8:
                return gameSignActivityDetail.getSignGiftList();
            case 9:
                return gameSignActivityDetail.getActivityBackgroundColor();
            case 10:
                return gameSignActivityDetail.getActivityId();
            case 11:
                return Long.valueOf(gameSignActivityDetail.getStartTime());
            case 12:
                return Long.valueOf(gameSignActivityDetail.getEndTime());
            case 13:
                return Integer.valueOf(gameSignActivityDetail.getActivityType());
            case 14:
                return Integer.valueOf(gameSignActivityDetail.getActivityStatus());
            case 15:
                return gameSignActivityDetail.getTitle();
            case 16:
                return Integer.valueOf(gameSignActivityDetail.getGameBaseId());
            case 17:
                return Integer.valueOf(gameSignActivityDetail.getMaxSignTimes());
            case 18:
                return gameSignActivityDetail.getSignTaskInfoList();
            case 19:
                return gameSignActivityDetail.getUserSignInfo();
            default:
                return null;
        }
    }
}
