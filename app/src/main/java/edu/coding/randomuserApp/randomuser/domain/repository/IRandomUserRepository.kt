package edu.coding.randomuserApp.randomuser.domain.repository

import edu.coding.randomuserApp.randomuser.data.remote.response.Name
import edu.coding.randomuserApp.randomuser.domain.model.Randomuser
import edu.coding.randomuserApp.randomuser.util.Resource
import kotlinx.coroutines.flow.Flow


interface IRandomUserRepository {

    suspend fun getRandomuser(
        forceFetch : Boolean,
        id: Int = -1,
        name: Name
    ) : Flow<Resource<List<Randomuser>>>

    suspend fun getRandomuser(ids: Int) : Flow<Resource<Randomuser>>
}