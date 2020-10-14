package org.bob.learn.service;

import org.bob.learn.dao.model.Blacklist;

import java.util.List;

public interface BlacklistService {

    /**
     * 添加黑名单
     *
     * @param blacklist
     */
    void addBlacklist(String mac,String sn,String dmac,String host);

    void delBlacklist(String mac, String sn,String dmac);

    /**
     * 查询黑名单列表
     *
     * @param blacklist
     * @return
     */
    List<Blacklist> listBlacklist(String mac,String sn,String dmac);

    /**
     * 查询黑名单
     *
     * @param blacklist
     * @return
     */
    Blacklist getBlacklist(Blacklist blacklist);

}
