package net.work100.training.stage2.design.patterns.builder;

/**
 * <p>Title: Bottle</p>
 * <p>Description: 瓶子</p>
 * <p>Url: http://www.work100.net/training/monolithic-architecture-design-patterns-builder-pattern.html</p>
 *
 * @author liuxiaojun
 * @date 2020-02-08 12:03
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-08   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
