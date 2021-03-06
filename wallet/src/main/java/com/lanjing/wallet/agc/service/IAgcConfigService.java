package com.lanjing.wallet.agc.service;

import java.util.List;
import com.lanjing.wallet.agc.domain.AgcConfig;

/**
 * AGC基础配置Service接口
 * 
 * @author live
 * @date 2020-10-26
 */
public interface IAgcConfigService 
{
    /**
     * 查询AGC基础配置
     * 
     * @param id AGC基础配置ID
     * @return AGC基础配置
     */
    public AgcConfig selectAgcConfigById(Long id);

    /**
     * 查询AGC基础配置列表
     * 
     * @param agcConfig AGC基础配置
     * @return AGC基础配置集合
     */
    public List<AgcConfig> selectAgcConfigList(AgcConfig agcConfig);

    /**
     * 新增AGC基础配置
     * 
     * @param agcConfig AGC基础配置
     * @return 结果
     */
    public int insertAgcConfig(AgcConfig agcConfig);

    /**
     * 修改AGC基础配置
     * 
     * @param agcConfig AGC基础配置
     * @return 结果
     */
    public int updateAgcConfig(AgcConfig agcConfig);

    /**
     * 批量删除AGC基础配置
     * 
     * @param ids 需要删除的AGC基础配置ID
     * @return 结果
     */
    public int deleteAgcConfigByIds(Long[] ids);

    /**
     * 删除AGC基础配置信息
     * 
     * @param id AGC基础配置ID
     * @return 结果
     */
    public int deleteAgcConfigById(Long id);
}
