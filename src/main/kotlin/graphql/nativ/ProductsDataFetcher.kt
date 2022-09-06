package graphql.nativ

import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory

@Singleton
class ProductsDataFetcher : DataFetcher<List<GqlProduct>> {

    private val log = LoggerFactory.getLogger(javaClass)

    override fun get(environment: DataFetchingEnvironment?): List<GqlProduct> {
        val list = mutableListOf<GqlProduct>()
        list.add(GqlProduct(1L, "Ext34", "Kind2"))
        return list
    }
}

