package com.seewo.brick.ktx // 包名别改

import android.animation.TimeInterpolator
import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

/**
 * 创建数值动画
 *
 * @param values 动画的目标数值列表
 * @param duration 单次动画的执行时长，单位毫秒
 * @param startDelay 动画延迟启动的时长，单位毫秒
 * @param repeatCount 动画重复播放次数，0为不重复，-1(ValueAnimator.INFINITE)为无限重复
 * @param repeatMode 动画重播模式，可选重新开始(ValueAnimator.RESTART)或反向(ValueAnimator.REVERSE)
 * @param interpolator 插值器
 * @param block 动画数值更新回调
 *
 * @see ValueAnimator.INFINITE
 * @see ValueAnimator.RESTART
 * @see ValueAnimator.REVERSE
 */
fun createAnimator(
    values: IntArray,
    duration: Long = 200L,
    startDelay: Long = 0L,
    repeatCount: Int? = null,
    repeatMode: Int? = null,
    interpolator: TimeInterpolator = LinearInterpolator(),
    block: ((Int) -> Unit)? = null
) = ValueAnimator.ofInt(*values).apply {
    this.duration = duration
    this.startDelay = startDelay
    repeatCount?.let {
        this.repeatCount = it
    }
    repeatMode?.let {
        this.repeatMode = it
    }
    this.interpolator = interpolator
    block?.let {
        addUpdateListener {
            it(it.animatedValue as Int)
        }
    }
}

/**
 * 创建数值动画
 *
 * @param values 动画的目标数值列表
 * @param duration 单次动画的执行时长，单位毫秒
 * @param startDelay 动画延迟启动的时长，单位毫秒
 * @param repeatCount 动画重复播放次数，0为不重复，-1(ValueAnimator.INFINITE)为无限重复
 * @param repeatMode 动画重播模式，可选重新开始(ValueAnimator.RESTART)或反向(ValueAnimator.REVERSE)
 * @param interpolator 插值器
 * @param block 动画数值更新回调
 *
 * @see ValueAnimator.INFINITE
 * @see ValueAnimator.RESTART
 * @see ValueAnimator.REVERSE
 */
fun createAnimator(
    values: FloatArray,
    duration: Long = 200L,
    startDelay: Long = 0L,
    repeatCount: Int? = null,
    repeatMode: Int? = null,
    interpolator: TimeInterpolator = LinearInterpolator(),
    block: ((Float) -> Unit)? = null
) = ValueAnimator.ofFloat(*values).apply {
    this.duration = duration
    this.startDelay = startDelay
    repeatCount?.let {
        this.repeatCount = it
    }
    repeatMode?.let {
        this.repeatMode = it
    }
    this.interpolator = interpolator
    block?.let {
        addUpdateListener {
            it(it.animatedValue as Float)
        }
    }
}

/**
 * 创建数值动画
 *
 * @param values 动画的目标数值列表
 * @param duration 单次动画的执行时长，单位毫秒
 * @param startDelay 动画延迟启动的时长，单位毫秒
 * @param repeatCount 动画重复播放次数，0为不重复，-1(ValueAnimator.INFINITE)为无限重复
 * @param repeatMode 动画重播模式，可选重新开始(ValueAnimator.RESTART)或反向(ValueAnimator.REVERSE)
 * @param interpolator 插值器
 * @param block 动画数值更新回调
 *
 * @see ValueAnimator.INFINITE
 * @see ValueAnimator.RESTART
 * @see ValueAnimator.REVERSE
 */
fun <T> T.createAnimator(
    values: IntArray,
    duration: Long = 200L,
    startDelay: Long = 0L,
    repeatCount: Int? = null,
    repeatMode: Int? = null,
    interpolator: TimeInterpolator = LinearInterpolator(),
    block: (T.(Int) -> Unit)? = null
) = ValueAnimator.ofInt(*values).apply {
    this.duration = duration
    this.startDelay = startDelay
    repeatCount?.let {
        this.repeatCount = it
    }
    repeatMode?.let {
        this.repeatMode = it
    }
    this.interpolator = interpolator
    block?.let {
        addUpdateListener {
            it(it.animatedValue as Int)
        }
    }
}

/**
 * 创建并启动数值动画
 *
 * @param values 动画的目标数值列表
 * @param duration 单次动画的执行时长，单位毫秒
 * @param startDelay 动画延迟启动的时长，单位毫秒
 * @param repeatCount 动画重复播放次数，0为不重复，-1(ValueAnimator.INFINITE)为无限重复
 * @param repeatMode 动画重播模式，可选重新开始(ValueAnimator.RESTART)或反向(ValueAnimator.REVERSE)
 * @param interpolator 插值器
 * @param block 动画数值更新回调
 *
 * @see ValueAnimator.INFINITE
 * @see ValueAnimator.RESTART
 * @see ValueAnimator.REVERSE
 */
fun<T> T.runAnimator(
    values: IntArray,
    duration: Long = 200L,
    startDelay: Long = 0L,
    repeatCount: Int? = null,
    repeatMode: Int? = null,
    interpolator: TimeInterpolator = LinearInterpolator(),
    block: (T.(Int) -> Unit)? = null
) = createAnimator(
    values, duration, startDelay, repeatCount, repeatMode, interpolator, block
).apply {
    start()
}

/**
 * 创建数值动画
 *
 * @param values 动画的目标数值列表
 * @param duration 单次动画的执行时长，单位毫秒
 * @param startDelay 动画延迟启动的时长，单位毫秒
 * @param repeatCount 动画重复播放次数，0为不重复，-1(ValueAnimator.INFINITE)为无限重复
 * @param repeatMode 动画重播模式，可选重新开始(ValueAnimator.RESTART)或反向(ValueAnimator.REVERSE)
 * @param interpolator 插值器
 * @param block 动画数值更新回调
 *
 * @see ValueAnimator.INFINITE
 * @see ValueAnimator.RESTART
 * @see ValueAnimator.REVERSE
 */
fun<T> T.createAnimator(
    values: FloatArray,
    duration: Long = 200L,
    startDelay: Long = 0L,
    repeatCount: Int? = null,
    repeatMode: Int? = null,
    interpolator: TimeInterpolator = LinearInterpolator(),
    block: (T.(Float) -> Unit)? = null
) = ValueAnimator.ofFloat(*values).apply {
    this.duration = duration
    this.startDelay = startDelay
    repeatCount?.let {
        this.repeatCount = it
    }
    repeatMode?.let {
        this.repeatMode = it
    }
    this.interpolator = interpolator
    block?.let {
        addUpdateListener {
            block(it.animatedValue as Float)
        }
    }
}

/**
 * 创建并启动数值动画
 *
 * @param values 动画的目标数值列表
 * @param duration 单次动画的执行时长，单位毫秒
 * @param startDelay 动画延迟启动的时长，单位毫秒
 * @param repeatCount 动画重复播放次数，0为不重复，-1(ValueAnimator.INFINITE)为无限重复
 * @param repeatMode 动画重播模式，可选重新开始(ValueAnimator.RESTART)或反向(ValueAnimator.REVERSE)
 * @param interpolator 插值器
 * @param block 动画数值更新回调
 *
 * @see ValueAnimator.INFINITE
 * @see ValueAnimator.RESTART
 * @see ValueAnimator.REVERSE
 */
fun<T> T.runAnimator(
    values: FloatArray,
    duration: Long = 200L,
    startDelay: Long = 0L,
    repeatCount: Int? = null,
    repeatMode: Int? = null,
    interpolator: TimeInterpolator = LinearInterpolator(),
    block: (T.(Float) -> Unit)? = null
) = createAnimator(
    values, duration, startDelay, repeatCount, repeatMode, interpolator, block
).run {
    start()
}
