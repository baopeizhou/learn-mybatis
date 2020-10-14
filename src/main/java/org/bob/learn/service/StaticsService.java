package org.bob.learn.service;

import org.bob.learn.dao.model.Statistics;

public interface StaticsService {
    /**
     * 增加拦截次数
     *
     * @param mac 家庭网关mac
     * @param sn  家庭网关sn
     */
    void saveStatistics(String mac, String sn);

    /**
     * 获取家庭网关的统计数据
     *
     * @param mac 家庭网关mac
     * @param sn  家庭网关sn
     * @return 统计信息
     */
    Statistics getStatistics(String mac, String sn);
}
