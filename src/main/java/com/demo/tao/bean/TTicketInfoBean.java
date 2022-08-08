package com.demo.tao.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wangwj
 * @ClassName: TTicketInfo
 * @Description: t_ticket_info: TTicketInfo
 * @date 2019年1月31日 下午6:02:59
 */
public class TTicketInfoBean implements Serializable
{
    /**
     * t_ticket_info: TTicketInfo
     */

    private static final long serialVersionUID = 1L;

    /**
     * 优惠券编码
     */
    private String            fTicketCode;

    /**
     * 优惠券名称
     */
    private String            fTicketName;

    /**
     * -1表示单品抵扣全额
     */
    private BigDecimal        fFee;

    /**
     * 生成时间
     */
    private String            fCreateTime;

    /**
     * 优惠券类型编码
     */
    private String            fTicketTypeId;

    /**
     * 优惠券兑换规则编码
     */
    private String            fExchangeRoleCode;

    /**
     * 会员编码
     */
    private String            fCusCode;

    /**
     * 会员名称
     */
    private String            fCusName;

    /**
     * 会员手机号
     */
    private String            fCusPhone;

    /**
     * 订单编码
     */
    private String            fOrderId;

    /**
     * (参考 State.TICKET_SOURCE)
     */
    private Integer           fSource;

    /**
     * 使用时间
     */
    private String            fUsedTime;

    /**
     * 有效期(开始时间)
     */
    private String            fStartTime;

    /**
     * 有效期(结束时间)
     */
    private String            fEndTime;

    /**
     * 制券批次号
     */
    private String            fMakeBatchId;

    /**
     * 是否是匿名劵（非匿名劵1 ，匿名劵2）
     */
    private Integer           fAnons;

    private String            fMarketId;

    /**
     * 营销名称
     */
    private String            fMarketName;

    /**
     * 券使用抵扣金额
     */
    private Long              fPayFee;

    /**
     * 使用门店
     */
    private String            fUsedShopCode;

    /**
     * 使用门店名称
     */
    private String            fUsedShopName;

    /**
     * 会员套餐信息主表编码
     */
    private String            fCardCode;

    /**
     * 大屏兑换券、领券对应门店编码
     */
    private String            fShopCode;

    /**
     * 领取门店名称
     */
    private String            fShopName;

    /**
     * 所属商户
     */
    private String            fMer;

    // 核销人
    private String            fUserCode;

    // 核销人名称
    private String            fUserName;

    // 核销时间
    private String            fTime;

    // 操作人id
    private String            fOperId;

    // 操作人名称
    private String            fOperName;

    private String            fUseType;

    // 优惠券类型
    private String            fTicketType;

    // 特殊编号，存放本券对应着的适用类型商品、商品类别以及品牌编号
    private String            specialCode;

    /**
     * 是否是多品券，默认是 单品券 0 ，多品券 1
     */
    private Integer           isMuchSelect;

    // 按指定消费金额 0 按整单消费金额 1
    private Integer           fIsSpecifySales;
    // 券类型编码
    private String            fTypeId;
    // 最低消费金额
    private long              fLowMoney;
    // 门店使用规则
    private String            fUseShopRule;
    // 能否与其它券同时使用,1:是。0:否
    private Integer           fIsTicketUseTogether;
    // 每单限用张数,-1标识不限
    private Integer           fLimitNum;
    // 使用时间段规则1不限2自定义
    private int               fUseTimeRule;
    // 券类型
    private String            fType;
    // 备注
    private String            fContent;

    // 1券使用来源
    private String            fTicketUseResource;
    // 状态
    private Integer           fState;

    private Integer           fMemberCommission;      // 会员券提成

    private Integer           useType;

    // 营销类型编码
    private String            fMarketTypeCode;

    /**
     * 是否分摊券
     */
    private String            fIsApportionment;

    // 使用订单号
    private String            fUsedOrderId;

    // 图片
    private String            fImage;

    // 券类型名称
    private String            fTypeName;

    private long              fMerheadShareFee;
    private long              fFirmShareFee;
    private long              fSendShopShareFee;
    private long              fUseShopShareFee;
    private String            fMerheadSharePerPercent;
    private String            fFirmSharePercent;
    private String            fSendShopSharePercent;
    private String            fUseShopSharePercent;
    private String            fIsFirmShare;           // 0停用，1启用
    private Integer           fOperState;             // 状态

    private Integer           fShareOperState;

    private Integer           fUseRange;              // 适用范围,0不限，1商城，2线下

    private Integer           fDays;                  // 有效天数

    private String            fUseTime;               // 0：不限 1：自定义
                                                      // 2：固定时长

    private String            fCheckNo;               // 验票码

    // 适用日期 曲江文旅
    private String            fUseDate;

    // 最高抵扣金额 -1表示不限
    private Integer           fMaxDiscount;

    // 企业微信群id
    private String            fEnterWechatId;

    // 企业微信群名称
    private String            fEnterWechatName;

    // 活动日历编码
    private String            fCalendarTemplateId;

    // 活动日历名称
    private String            fCalendarTemplateName;

    public String getfUseDate()
    {
        return fUseDate;
    }

    public void setfUseDate(String fUseDate)
    {
        this.fUseDate = fUseDate;
    }

    public String getfCheckNo()
    {
        return fCheckNo;
    }

    public void setfCheckNo(String fCheckNo)
    {
        this.fCheckNo = fCheckNo;
    }

    public Integer getfShareOperState()
    {
        return fShareOperState;
    }

    public void setfShareOperState(Integer fShareOperState)
    {
        this.fShareOperState = fShareOperState;
    }

    public Integer getfOperState()
    {
        return fOperState;
    }

    public void setfOperState(Integer fOperState)
    {
        this.fOperState = fOperState;
    }

    public String getfIsApportionment()
    {
        return fIsApportionment;
    }

    public void setfIsApportionment(String fIsApportionment)
    {
        this.fIsApportionment = fIsApportionment;
    }

    public Integer getIsMuchSelect()
    {
        return isMuchSelect == null ? 0 : isMuchSelect;
    }

    public void setIsMuchSelect(Integer isMuchSelect)
    {
        this.isMuchSelect = isMuchSelect;
    }

    public String getSpecialCode()
    {
        return specialCode;
    }

    public void setSpecialCode(String specialCode)
    {
        this.specialCode = specialCode;
    }

    public String getfTicketType()
    {
        return fTicketType;
    }

    public void setfTicketType(String fTicketType)
    {
        this.fTicketType = fTicketType;
    }

    public String getfUseType()
    {
        return fUseType;
    }

    public void setfUseType(String fUseType)
    {
        this.fUseType = fUseType;
    }

    public String getfCusPhone()
    {
        return fCusPhone;
    }

    public void setfCusPhone(String fCusPhone)
    {
        this.fCusPhone = fCusPhone;
    }

    public String getfTicketCode()
    {
        return fTicketCode;
    }

    public void setfTicketCode(String fTicketCode)
    {
        this.fTicketCode = fTicketCode;
    }

    public String getfTicketName()
    {
        return fTicketName;
    }

    public void setfTicketName(String fTicketName)
    {
        this.fTicketName = fTicketName;
    }

    public BigDecimal getfFee()
    {
        return new BigDecimal(new BigDecimal(String.valueOf(fFee)).stripTrailingZeros().toPlainString());
    }

    public void setfFee(BigDecimal fFee)
    {
        this.fFee = fFee;
    }

    public String getfCreateTime()
    {
        return fCreateTime;
    }

    public void setfCreateTime(String fCreateTime)
    {
        this.fCreateTime = fCreateTime;
    }

    public String getfTicketTypeId()
    {
        return fTicketTypeId;
    }

    public void setfTicketTypeId(String fTicketTypeId)
    {
        this.fTicketTypeId = fTicketTypeId;
    }

    public String getfExchangeRoleCode()
    {
        return fExchangeRoleCode;
    }

    public void setfExchangeRoleCode(String fExchangeRoleCode)
    {
        this.fExchangeRoleCode = fExchangeRoleCode;
    }

    public String getfCusCode()
    {
        return fCusCode;
    }

    public void setfCusCode(String fCusCode)
    {
        this.fCusCode = fCusCode;
    }

    public String getfCusName()
    {
        return fCusName;
    }

    public void setfCusName(String fCusName)
    {
        this.fCusName = fCusName;
    }

    public String getfOrderId()
    {
        return fOrderId;
    }

    public void setfOrderId(String fOrderId)
    {
        this.fOrderId = fOrderId;
    }

    public Integer getfSource()
    {
        return fSource;
    }

    public void setfSource(Integer fSource)
    {
        this.fSource = fSource;
    }

    public String getfUsedTime()
    {
        return fUsedTime;
    }

    public void setfUsedTime(String fUsedTime)
    {
        this.fUsedTime = fUsedTime;
    }

    public String getfStartTime()
    {
        return fStartTime;
    }

    public void setfStartTime(String fStartTime)
    {
        this.fStartTime = fStartTime;
    }

    public String getfEndTime()
    {
        return fEndTime;
    }

    public void setfEndTime(String fEndTime)
    {
        this.fEndTime = fEndTime;
    }

    public String getfMakeBatchId()
    {
        return fMakeBatchId;
    }

    public void setfMakeBatchId(String fMakeBatchId)
    {
        this.fMakeBatchId = fMakeBatchId;
    }

    public Integer getfAnons()
    {
        return fAnons;
    }

    public void setfAnons(Integer fAnons)
    {
        this.fAnons = fAnons;
    }

    public String getfMarketId()
    {
        return fMarketId;
    }

    public void setfMarketId(String fMarketId)
    {
        this.fMarketId = fMarketId;
    }

    public String getfMarketName()
    {
        return fMarketName;
    }

    public void setfMarketName(String fMarketName)
    {
        this.fMarketName = fMarketName;
    }

    public Long getfPayFee()
    {
        return fPayFee;
    }

    public void setfPayFee(Long fPayFee)
    {
        this.fPayFee = fPayFee;
    }

    public String getfUsedShopCode()
    {
        return fUsedShopCode;
    }

    public void setfUsedShopCode(String fUsedShopCode)
    {
        this.fUsedShopCode = fUsedShopCode;
    }

    public String getfUsedShopName()
    {
        return fUsedShopName;
    }

    public void setfUsedShopName(String fUsedShopName)
    {
        this.fUsedShopName = fUsedShopName;
    }

    public String getfCardCode()
    {
        return fCardCode;
    }

    public void setfCardCode(String fCardCode)
    {
        this.fCardCode = fCardCode;
    }

    public String getfShopCode()
    {
        return fShopCode;
    }

    public void setfShopCode(String fShopCode)
    {
        this.fShopCode = fShopCode;
    }

    public String getfShopName()
    {
        return fShopName;
    }

    public void setfShopName(String fShopName)
    {
        this.fShopName = fShopName;
    }

    public String getfMer()
    {
        return fMer;
    }

    public void setfMer(String fMer)
    {
        this.fMer = fMer;
    }

    public String getfUserCode()
    {
        return fUserCode;
    }

    public void setfUserCode(String fUserCode)
    {
        this.fUserCode = fUserCode;
    }

    public String getfUserName()
    {
        return fUserName;
    }

    public void setfUserName(String fUserName)
    {
        this.fUserName = fUserName;
    }

    public String getfTime()
    {
        return fTime;
    }

    public void setfTime(String fTime)
    {
        this.fTime = fTime;
    }

    public String getfOperId()
    {
        return fOperId;
    }

    public void setfOperId(String fOperId)
    {
        this.fOperId = fOperId;
    }

    public String getfOperName()
    {
        return fOperName;
    }

    public void setfOperName(String fOperName)
    {
        this.fOperName = fOperName;
    }

    public Integer getfIsSpecifySales()
    {
        return fIsSpecifySales;
    }

    public void setfIsSpecifySales(Integer fIsSpecifySales)
    {
        this.fIsSpecifySales = fIsSpecifySales;
    }

    public String getfTypeId()
    {
        return fTypeId;
    }

    public void setfTypeId(String fTypeId)
    {
        this.fTypeId = fTypeId;
    }

    public long getfLowMoney()
    {
        return fLowMoney;
    }

    public void setfLowMoney(long fLowMoney)
    {
        this.fLowMoney = fLowMoney;
    }

    public String getfUseShopRule()
    {
        return fUseShopRule;
    }

    public void setfUseShopRule(String fUseShopRule)
    {
        this.fUseShopRule = fUseShopRule;
    }

    public Integer getfIsTicketUseTogether()
    {
        return fIsTicketUseTogether;
    }

    public void setfIsTicketUseTogether(Integer fIsTicketUseTogether)
    {
        this.fIsTicketUseTogether = fIsTicketUseTogether;
    }

    public Integer getfLimitNum()
    {
        return fLimitNum;
    }

    public void setfLimitNum(Integer fLimitNum)
    {
        this.fLimitNum = fLimitNum;
    }

    public int getfUseTimeRule()
    {
        return fUseTimeRule;
    }

    public void setfUseTimeRule(int fUseTimeRule)
    {
        this.fUseTimeRule = fUseTimeRule;
    }

    public String getfType()
    {
        return fType;
    }

    public void setfType(String fType)
    {
        this.fType = fType;
    }

    public String getfContent()
    {
        return fContent;
    }

    public void setfContent(String fContent)
    {
        this.fContent = fContent;
    }

    public String getfTicketUseResource()
    {
        return fTicketUseResource;
    }

    public void setfTicketUseResource(String fTicketUseResource)
    {
        this.fTicketUseResource = fTicketUseResource;
    }

    public Integer getfState()
    {
        return fState;
    }

    public void setfState(Integer fState)
    {
        this.fState = fState;
    }

    public Integer getfMemberCommission()
    {
        return fMemberCommission;
    }

    public void setfMemberCommission(Integer fMemberCommission)
    {
        this.fMemberCommission = fMemberCommission;
    }

    public Integer getUseType()
    {
        return useType;
    }

    public void setUseType(Integer useType)
    {
        this.useType = useType;
    }

    public String getfMarketTypeCode()
    {
        return fMarketTypeCode;
    }

    public void setfMarketTypeCode(String fMarketTypeCode)
    {
        this.fMarketTypeCode = fMarketTypeCode;
    }

    public String getfUsedOrderId()
    {
        return fUsedOrderId;
    }

    public void setfUsedOrderId(String fUsedOrderId)
    {
        this.fUsedOrderId = fUsedOrderId;
    }

    public String getfImage()
    {
        return fImage;
    }

    public void setfImage(String fImage)
    {
        this.fImage = fImage;
    }

    public String getfTypeName()
    {
        return fTypeName;
    }

    public void setfTypeName(String fTypeName)
    {
        this.fTypeName = fTypeName;
    }

    public long getfMerheadShareFee()
    {
        return fMerheadShareFee;
    }

    public void setfMerheadShareFee(long fMerheadShareFee)
    {
        this.fMerheadShareFee = fMerheadShareFee;
    }

    public long getfFirmShareFee()
    {
        return fFirmShareFee;
    }

    public void setfFirmShareFee(long fFirmShareFee)
    {
        this.fFirmShareFee = fFirmShareFee;
    }

    public long getfSendShopShareFee()
    {
        return fSendShopShareFee;
    }

    public void setfSendShopShareFee(long fSendShopShareFee)
    {
        this.fSendShopShareFee = fSendShopShareFee;
    }

    public long getfUseShopShareFee()
    {
        return fUseShopShareFee;
    }

    public void setfUseShopShareFee(long fUseShopShareFee)
    {
        this.fUseShopShareFee = fUseShopShareFee;
    }

    public String getfMerheadSharePerPercent()
    {
        return fMerheadSharePerPercent;
    }

    public void setfMerheadSharePerPercent(String fMerheadSharePerPercent)
    {
        this.fMerheadSharePerPercent = fMerheadSharePerPercent;
    }

    public String getfFirmSharePercent()
    {
        return fFirmSharePercent;
    }

    public void setfFirmSharePercent(String fFirmSharePercent)
    {
        this.fFirmSharePercent = fFirmSharePercent;
    }

    public String getfSendShopSharePercent()
    {
        return fSendShopSharePercent;
    }

    public void setfSendShopSharePercent(String fSendShopSharePercent)
    {
        this.fSendShopSharePercent = fSendShopSharePercent;
    }

    public String getfUseShopSharePercent()
    {
        return fUseShopSharePercent;
    }

    public void setfUseShopSharePercent(String fUseShopSharePercent)
    {
        this.fUseShopSharePercent = fUseShopSharePercent;
    }

    public String getfIsFirmShare()
    {
        return fIsFirmShare;
    }

    public void setfIsFirmShare(String fIsFirmShare)
    {
        this.fIsFirmShare = fIsFirmShare;
    }

    public Integer getfUseRange()
    {
        return fUseRange;
    }

    public void setfUseRange(Integer fUseRange)
    {
        this.fUseRange = fUseRange;
    }

    public Integer getfDays()
    {
        return fDays;
    }

    public void setfDays(Integer fDays)
    {
        this.fDays = fDays;
    }

    public String getfUseTime()
    {
        return fUseTime;
    }

    public void setfUseTime(String fUseTime)
    {
        this.fUseTime = fUseTime;
    }

    public Integer getfMaxDiscount()
    {
        return fMaxDiscount;
    }

    public void setfMaxDiscount(Integer fMaxDiscount)
    {
        this.fMaxDiscount = fMaxDiscount;
    }

    public String getfEnterWechatId()
    {
        return fEnterWechatId;
    }

    public void setfEnterWechatId(String fEnterWechatId)
    {
        this.fEnterWechatId = fEnterWechatId;
    }

    public String getfEnterWechatName()
    {
        return fEnterWechatName;
    }

    public void setfEnterWechatName(String fEnterWechatName)
    {
        this.fEnterWechatName = fEnterWechatName;
    }

    public String getfCalendarTemplateId()
    {
        return fCalendarTemplateId;
    }

    public void setfCalendarTemplateId(String fCalendarTemplateId)
    {
        this.fCalendarTemplateId = fCalendarTemplateId;
    }

    public String getfCalendarTemplateName()
    {
        return fCalendarTemplateName;
    }

    public void setfCalendarTemplateName(String fCalendarTemplateName)
    {
        this.fCalendarTemplateName = fCalendarTemplateName;
    }
}
