package com.lmx.springbootmybatis.com.lmx.po

import lombok.Data

/**
 * @author LiumengMengXiang
 * @create 2019-04-11:17
 */
@Data
class Student {
    var id: Int = 0
        set(id) {
            field = this.id
        }
    var name: String? = null
        set(name) {
            field = this.name
        }
    var sex: Int = 0
        set(sex) {
            field = this.sex
        }
}
