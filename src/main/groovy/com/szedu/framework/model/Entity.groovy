package com.szedu.framework.model

import javax.persistence.*

@MappedSuperclass
class EntityImpl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	String id
}
