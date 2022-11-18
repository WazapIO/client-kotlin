/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package whatsapi

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import models.APIResponse
import models.PaymentRequestPayload

import com.squareup.moshi.Json

import WhatsAPI.infrastructure.ApiClient
import WhatsAPI.infrastructure.ApiResponse
import WhatsAPI.infrastructure.ClientException
import WhatsAPI.infrastructure.ClientError
import WhatsAPI.infrastructure.ServerException
import WhatsAPI.infrastructure.ServerError
import WhatsAPI.infrastructure.MultiValueMap
import WhatsAPI.infrastructure.PartConfig
import WhatsAPI.infrastructure.RequestConfig
import WhatsAPI.infrastructure.RequestMethod
import WhatsAPI.infrastructure.ResponseType
import WhatsAPI.infrastructure.Success
import WhatsAPI.infrastructure.toMultiValue

class BusinessManagementApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "/api")
        }
    }

    /**
     * Fetches the catlog.
     * Gets list of all products registered by you.
     * @param instanceKey Instance key
     * @return APIResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun fetchCatlog(instanceKey: kotlin.String) : APIResponse {
        val localVarResponse = fetchCatlogWithHttpInfo(instanceKey = instanceKey)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as APIResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Fetches the catlog.
     * Gets list of all products registered by you.
     * @param instanceKey Instance key
     * @return ApiResponse<APIResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun fetchCatlogWithHttpInfo(instanceKey: kotlin.String) : ApiResponse<APIResponse?> {
        val localVariableConfig = fetchCatlogRequestConfig(instanceKey = instanceKey)

        return request<Unit, APIResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation fetchCatlog
     *
     * @param instanceKey Instance key
     * @return RequestConfig
     */
    fun fetchCatlogRequestConfig(instanceKey: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/instances/{instance_key}/business/catalog".replace("{"+"instance_key"+"}", encodeURIComponent(instanceKey.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Send a payment request.
     * Sends an payment request to a user. Feature is still in beta.
     * @param instanceKey Instance key
     * @param `data` Data
     * @return APIResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun sendPaymentRequest(instanceKey: kotlin.String, `data`: PaymentRequestPayload) : APIResponse {
        val localVarResponse = sendPaymentRequestWithHttpInfo(instanceKey = instanceKey, `data` = `data`)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as APIResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Send a payment request.
     * Sends an payment request to a user. Feature is still in beta.
     * @param instanceKey Instance key
     * @param `data` Data
     * @return ApiResponse<APIResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun sendPaymentRequestWithHttpInfo(instanceKey: kotlin.String, `data`: PaymentRequestPayload) : ApiResponse<APIResponse?> {
        val localVariableConfig = sendPaymentRequestRequestConfig(instanceKey = instanceKey, `data` = `data`)

        return request<PaymentRequestPayload, APIResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation sendPaymentRequest
     *
     * @param instanceKey Instance key
     * @param `data` Data
     * @return RequestConfig
     */
    fun sendPaymentRequestRequestConfig(instanceKey: kotlin.String, `data`: PaymentRequestPayload) : RequestConfig<PaymentRequestPayload> {
        val localVariableBody = `data`
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/instances/{instance_key}/business/payment-request".replace("{"+"instance_key"+"}", encodeURIComponent(instanceKey.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
