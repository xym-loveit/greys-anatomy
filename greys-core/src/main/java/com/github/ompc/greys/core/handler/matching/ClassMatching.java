package com.github.ompc.greys.core.handler.matching;

import static com.github.ompc.greys.core.util.GaReflectUtils.DEFAULT_MOD;
import static com.github.ompc.greys.core.util.GaReflectUtils.DEFAULT_TYPE;

/**
 * 类匹配
 * Created by vlinux on 15/11/2.
 */
public class ClassMatching {

    // 访问修饰符
    private int modifier = DEFAULT_MOD;

    // 类类型
    private int type = DEFAULT_TYPE;

    // 类名匹配
    private PatternMatching name;

    public int getModifier() {
        return modifier;
    }

    public int getType() {
        return type;
    }

    public PatternMatching getName() {
        return name;
    }
}
