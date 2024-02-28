package top.fhcy.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("study")
public class Study {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String code;

    private String name;

    private String description;
}
