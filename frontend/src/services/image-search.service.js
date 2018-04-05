import * as axios from 'axios'

function searchImage (formData) {
  const url = `./api/search/image`
  return axios.post(url, formData)
  // get data
    .then(x => x.data)
}

function uploadImage (formData) {
  const url = `./api/index/image`
  return axios.post(url, formData)
  // get data
    .then(x => x.data)
}

export { searchImage, uploadImage }
