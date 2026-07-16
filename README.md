# Journal Application API (POST-Only Edition)

A minimalist Spring Boot-based backend module designed solely for creating and persisting journal entries in MongoDB. This version implements a clean Controller-Service-Repository architecture focused on a single-write pathway, verifying successful storage with a boolean confirmation flag.

---

## 🚀 Features

* **Single-Purpose POST Handler**: Dedicated strictly to entry creation, ensuring a streamlined and specialized write API.
* **Automated Date-Stamping**: Automatically appends the exact local creation timestamp (`LocalDateTime.now()`) to incoming journal data before saving.
* **Confirmation-Based Return**: Simplifies client-side handling by returning a straightforward `boolean` flag (`true`) upon successful operation execution.

---

## 📂 Structural Overview

The application features decoupled layers to maintain clean architecture standards:
* **Controller (`JournalEntryControllerV2`)**: Exposes the root REST mapping path under `/journal`, intercepting incoming JSON requests, attaching timestamps, and dispatching tasks down the stack.
* **Service (`JournalEntryService`)**: Contains the transactional save routing, serving as the bridge to the persistence layer.
* **Repository (`JournalEntryRepository`)**: Connects directly with MongoDB to safely save the finalized document.

---

## 🛣️ Active API Endpoints

The active endpoint is configured under the base mapping prefix: `/journal`

| Method | Endpoint | Description | Payload Requirements | Returns |
| :--- | :--- | :--- | :--- | :--- |
| **POST** | `/journal` | Automatically stamps and saves a new journal entry to the database. | Requires a JSON representation of `JournalEntry` in the request body. | `boolean` (`true`) |

---

## 🛠️ Technology Stack

* **Java** (JDK 17+)
* **Spring Boot Framework** (Spring Web)
* **Spring Data MongoDB**

---

## ⚡ Quick Start

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/post-mapping-api.git](https://github.com/your-username/post-mapping-api.git)
