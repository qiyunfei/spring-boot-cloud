package com.f1ne.springboot.learn.domain.kafka;

import java.util.Date;

public class TblProdConsuMsgRecord {
    private Long id;

    private Integer type;

    private String recordTopic;
    
    private Integer recordPartition;

    private Long recordOffset;
    
    private Long recordTimestamp;

    private String recordKey;
    
    private String recordValue;
    
    private Integer status;
    
    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRecordTopic() {
        return recordTopic;
    }

    public void setRecordTopic(String recordTopic) {
        this.recordTopic = recordTopic == null ? null : recordTopic.trim();
    }

    public String getRecordKey() {
        return recordKey;
    }

    public void setRecordKey(String recordKey) {
        this.recordKey = recordKey == null ? null : recordKey.trim();
    }

    public Long getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(Long recordOffset) {
        this.recordOffset = recordOffset;
    }

    public Integer getRecordPartition() {
        return recordPartition;
    }

    public void setRecordPartition(Integer recordPartition) {
        this.recordPartition = recordPartition;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRecordValue() {
        return recordValue;
    }

    public void setRecordValue(String recordValue) {
        this.recordValue = recordValue == null ? null : recordValue.trim();
    }
    
	public Long getRecordTimestamp() {
		return recordTimestamp;
	}

	public void setRecordTimestamp(Long recordTimestamp) {
		this.recordTimestamp = recordTimestamp;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public TblProdConsuMsgRecord(Long id, Integer type, String recordTopic, Integer recordPartition, Long recordOffset,Long recordTimestamp,
			String recordKey, String recordValue) {
		super();
		this.id = id; 
		this.type = type;
		this.recordTopic = recordTopic;
		this.recordPartition = recordPartition;
		this.recordOffset = recordOffset;
		this.recordTimestamp = recordTimestamp;
		this.recordKey = recordKey;
		this.recordValue = recordValue;
		this.status =1;
	}

	public TblProdConsuMsgRecord() {
		super();
	}
    
	public TblProdConsuMsgRecord(Long id, Integer type, String recordTopic, String recordValue) {
		super();
		this.id = id;
		this.type = type;
		this.recordTopic = recordTopic;
		this.recordValue = recordValue;
		this.status = 1;
	}
	public TblProdConsuMsgRecord(Long id, Integer type, String recordTopic, String recordKey,String recordValue) {
        super();
        this.id = id;
        this.type = type;
        this.recordTopic = recordTopic;
        this.recordKey = recordKey;
        this.recordValue = recordValue;
        this.status = 1;
    }
}