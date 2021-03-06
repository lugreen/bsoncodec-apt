/**
 * Copyright 2015-2016 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.rasc.bsoncodec.test.array;

import org.bson.types.ObjectId;

import ch.rasc.bsoncodec.annotation.BsonDocument;
import ch.rasc.bsoncodec.annotation.Field;

@BsonDocument(storeEmptyCollections = true)
public class Array2PojoFixed {

	private ObjectId _id;

	@Field(fixedArray = 2)
	private Integer[] array;

	public ObjectId get_id() {
		return this._id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Integer[] getArray() {
		return this.array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}

}
