package classesandinheritance

/**
 * Created by pranit on 19/7/17.
 */
class PropertiesAndField {

    class Address{
        var name: String = "name"
        var street: String = "xyz"
        var city: String = "mumbai"
        var state: String? = null
            private set(value) {
                doSomeThing(value)
            }

        private fun doSomeThing(value: String?) :Unit{
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        var zip: String = "400001"

        var streetIsEmpty : Boolean = false
            get() = name.length > 0
    }

    fun copyAddress(source: Address): Address{
        var result = Address()
        result.name = source.name
        result.city = source.city
        return result
    }
}